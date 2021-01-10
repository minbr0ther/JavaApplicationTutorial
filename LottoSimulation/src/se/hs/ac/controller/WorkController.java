package se.hs.ac.controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import se.hs.ac.view.WorkView;

public class WorkController {

	private final WorkView view;
	private final int SIXTH = 6;

	public WorkController() {
		this.view = new WorkView();
	}

	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (true) {
				view.showQuestion();
				int num = Integer.parseInt(br.readLine());

				int[][] exampleNumbers = new int[num][SIXTH]; // num x 6 의 다차원 배열 생성
				inputExampleNumber(num, exampleNumbers); // 자동으로 생성된 번호 다차원 배열에 넣기
				view.showExampleNumbers(num, exampleNumbers); // 생성 된 번호 출력

				int[] winningNumber = new int[SIXTH + 1]; // 당첨 번호 6개 + 보너스 번호 1개
				inputWinningNumber(winningNumber);
				view.showWinningNumber(winningNumber);

				// 로또의 당첨여부를 통계내어 출력
				int[] howManyHit = new int[num];

				for (int i = 0; i < num; i++) {
					for (int j = 0; j < SIXTH; j++) {
						for (int k = 0; k < j; k++) {
							if (exampleNumbers[i][j] == winningNumber[k]) {
								howManyHit[i] += 1;
								// System.out.println(i+1+"회차 "+(j+1)+"번째 숫자 "+(k+1)+"번째 당첨번호와 일치!");
							}
						}
					}
				}

				for (int i = 0; i < num; i++) {
					// System.out.println((i+1)+"회차 "+howManyHit[i]+"번 맞춤 :)");
					if (howManyHit[i] == 6) {
						System.out.println(">> " + (i+1) + "회차 1등입니다 축하드립니다.");
					} else if (howManyHit[i] == 5) {
						System.out.println(">> " + (i+1) + "회차 3등입니다 축하드립니다.");
//					} else if (howManyHit[i] == 4) {
						System.out.println(">> " + (i+1) + "회차 4등입니다 축하드립니다.");
					} else if (howManyHit[i] == 3) {
						System.out.println(">> " + (i+1) + "회차 5등입니다 축하드립니다.");
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			view.showError();
		}
	}

	private void inputWinningNumber(int[] winningNumber) {
		for (int j = 0; j < SIXTH + 1; j++) {
			winningNumber[j] = (int) (Math.random() * 42 + 1);
			// checkDuplicateValues(i, j, exampleNumbers); //중복 값 체크 메소드 뺄려고 했으나 실패..
			for (int k = 0; k < j; k++) {
				if (winningNumber[j] == winningNumber[k]) {
					// System.out.println(i+", "+j+"중복발생! "+exampleNumbers[i][j]+"
					// "+exampleNumbers[i][k]);
					view.showDuplicateError();
					j--;
				}
			}
		}
	}

	private void inputExampleNumber(int num, int[][] exampleNumbers) { // 배열에 1~42의 무작위 값 입력
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < SIXTH; j++) {
				exampleNumbers[i][j] = (int) (Math.random() * 42 + 1);
				// checkDuplicateValues(i, j, exampleNumbers); //중복 값 체크 메소드 뺄려고 했으나 실패..
				for (int k = 0; k < j; k++) {
					if (exampleNumbers[i][j] == exampleNumbers[i][k]) {
						// System.out.println(i+", "+j+"중복발생! "+exampleNumbers[i][j]+"
						// "+exampleNumbers[i][k]);
						view.showDuplicateError();
						j--;
					}
				}
			}
		}
	}

	private int checkDuplicateValues(int i, int j, int[][] exampleNumbers) { // 중복 값 체크
		for (int k = 0; k < j; k++) {
			if (exampleNumbers[i][j] == exampleNumbers[i][k]) {
				// System.out.println(i+", "+j+"중복발생! "+exampleNumbers[i][j]+"
				// "+exampleNumbers[i][k]);
				view.showDuplicateError();
				return j--;
			}
		}
		return j;
	}

}
