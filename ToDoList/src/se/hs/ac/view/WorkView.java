package se.hs.ac.view;

import se.hs.ac.module.WorkModule;

public class WorkView {

	public void showMenu() {
		System.out.print("1) 추가하기 | 2) 수정하기 | 3) 삭제하기 | 4) 조회하기 |  0) 종료 : \n");
		System.out.print("=> ");		
	}

	public void showInputTodo() {
		System.out.print("TODO를 입력하세요 : ");
	}

	public void showWorkList(String string) {
		System.out.println("\n"+string+"하고 싶은 ID를 골라주세요 :)\n");
		WorkModule.showWorkList();
		System.out.print("=> ");
	}

}
