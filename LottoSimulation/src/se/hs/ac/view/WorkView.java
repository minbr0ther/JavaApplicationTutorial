package se.hs.ac.view;

public class WorkView {

	private final int SIXTH = 6;
	
	public void showQuestion() {
		System.out.print("$ 몇개의 로또를 생성하시겠습니까? \n=> ");
	}
	
	public void showError() {
		System.out.println("$ 비정상적인 프로그램상 에러로 프로그램이 종료됩니다.");
	}

	public void showExampleNumbers(int num, int exampleNumbers[][]) {
		System.out.println("\n$ "+num+"개의 로또 번호를 생성합니다 (숫자 1~42)");
		System.out.println("--------------------------------------------------");
		System.out.println("1번째\t2번째\t3번째\t4번째\t5번째\t6번째");
		System.out.println("--------------------------------------------------");

		for(int i=0; i<num; i++) {
			//System.out.print(i+1+"\t| 20");
			for(int j=0; j<SIXTH; j++) {
				System.out.print(exampleNumbers[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------\n");
	}

	public void showDuplicateError() {
		//중복 된 값 생성!
	}

	public void showWinningNumber(int[] winningNumber) {
		System.out.println("$ 당첨 로또 번호를 생성합니다 6개 + 보너스 번호");
		System.out.println("--------------------------------------------------");
		
		for(int j=0; j<SIXTH; j++) {
			System.out.print("("+winningNumber[j]+")   ");
		}
		System.out.println("+  ("+winningNumber[SIXTH]+")");
		
		System.out.println("--------------------------------------------------\n");		
	}

}
