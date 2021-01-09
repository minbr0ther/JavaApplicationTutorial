package se.hs.ac.module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import se.hs.ac.vo.Work;

public class WorkModule { //리스트 관련된 로직, 입력을 받으면 안

	private int id = 0; // Primary Key
	int selectedId = 0; // 선택받을 ID

	private final static ArrayList<Work> workList = new ArrayList<>(); // 타입추론, 인터페이스 캐스팅
	AscendingStatus comp = new AscendingStatus(); // status

	public void init() {
		workList.add(new Work(id, "2020-12-23", "오늘은 자바공부!", 0));
		workList.add(new Work(++id, "2020-12-24", "데이터베이스공부", 0));
		workList.add(new Work(++id, "2020-12-24", "데이터찾기", 1));
		workList.add(new Work(++id, "2020-12-25", "아무것도 안하기", 0));
		workList.add(new Work(++id, "2020-12-24", "자바공부", 2));
		workList.add(new Work(++id, "2020-12-26", "MySQL 공부하기", 1));
		workList.add(new Work(++id, "2020-12-24", "공부 계획 세우기", 2));
	}

	public void addWork(String content) {
		workList.add(new Work(++id, content));

		Collections.sort(workList, comp); // add 할때마다 status순으로 정렬 (0,1,2)
	}

	public static void showWorkList() { // 나중에 view로 옮길예정
		for (int i = 0; i < workList.size(); i++) { // 보기로 전체 리스트 보여주기
			System.out.println(
					workList.get(i).getId() 
					+ "\t" + workList.get(i).getDate() 
					+ "\t" + workList.get(i).getContent());
		}
	}

	public void updateWork(int selectedId) {
		if (selectedId < workList.size()) { // 일치하지 않는 id 예외처리
			for (int i = 0; i < workList.size(); i++) {
				if (workList.get(i).getId() == selectedId) { // 입력받은 id와 같은 id를 가지고 있는 항목을 찾는다
					if (workList.get(i).getStatus() == 0) { // status가 TODO 이라면
						workList.get(i).setStatus(1); // TODO -> DOING
						System.out.println("수정이 완료되었습니다. (TODO -> DOING)");
					} else if (workList.get(i).getStatus() == 1) { // status가 DOING 이라면
						workList.get(i).setStatus(2); // DOING -> DONE
						System.out.println("수정이 완료되었습니다. (DOING -> DONE)");
					} else if (workList.get(i).getStatus() == 2) { // status가 DONE 이라면
						System.out.println("이미 완료된 항목입니다.");
						break;
					}
					break;
				}
			}
		} else {
			System.out.println("일치하는 id가 없습니다.");
			return;
		}
	}

	public void removeWork(int selectedId2) {
		if (selectedId < workList.size()) { // 일치하지 않는 id 예외처리
			for (int i = 0; i < workList.size(); i++) {
				if (workList.get(i).getId() == selectedId) { // 입력받은 id와 같은 id를 가지고 있는 항목을 찾는다

					workList.remove(workList.indexOf(workList.get(i)));
					// 현 상황의 객체의 인덱스를 파악해서 리스트에서 삭제한다.

					System.out.println("삭제가 완료되었습니다.");
					break;
				}
			}
		} else {
			System.out.println("일치하는 id가 없습니다.");
			return;
		}
	}

	public void printWorkList() {
		for (int j = 0; j < 3; j++) {

			// todo , doing, done 분기 예정

			for (int i = 0; i < workList.size(); i++) {
				if (workList.get(i).getStatus() == j) {
					System.out.println(workList.get(i).getDate() + " " + workList.get(i).getContent());
				}
			}
		}
	}
}

class AscendingStatus implements Comparator<Work> { // 오름차순 정렬
	@Override
	public int compare(Work a, Work b) {
		if (a.getStatus() > b.getStatus())
			return 1;
		if (a.getStatus() < b.getStatus())
			return -1;
		return 0;
	}
}
