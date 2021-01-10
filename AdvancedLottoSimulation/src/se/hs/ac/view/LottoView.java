package se.hs.ac.view;

import se.hs.ac.vo.ExampleLotto;
import se.hs.ac.vo.WinningLotto;

import java.util.ArrayList;
import java.util.Iterator;

public class LottoView {

	public static void showLottoRank(ArrayList<ExampleLotto> exampleLottoList, WinningLotto winningLotto) {
		for (ExampleLotto exampleLotto : exampleLottoList) {
			int cnt = exampleLotto.getMatchCount();
			int bonusNum = winningLotto.getBonusNumber();

			if (cnt == 6) {
				System.out.println(">> "
						+ (exampleLotto.getId()+1)
						+ "회차 1등입니다 축하드립니다.");
			}
			else if (cnt == 5) {
				//보너스 넘버와 검색된 리스트의 항목 번호들을 다시 매치해보고 있으면 출력
				if (exampleLotto.getBasicNumbers().contains(bonusNum)) {
					System.out.println(">> "
							+ (exampleLotto.getId()+1)
							+ "회차 2등입니다 축하드립니다.");
				}
				else {
					System.out.println(">> "
							+ (exampleLotto.getId()+1)
							+ "회차 3등입니다 축하드립니다.");
				}
			}
			else if (cnt == 4) {
				System.out.println(">> "
						+ (exampleLotto.getId()+1)
						+ "회차 4등입니다 축하드립니다.");
			}
			else if (cnt == 3) {
				System.out.println(">> "
						+ (exampleLotto.getId()+1)
						+ "회차 5등입니다 축하드립니다.");
			}
		}
		System.out.println("");
	}

	public void showQuestion() {
		System.out.print("$ 몇개의 로또를 생성하시겠습니까? \n=> ");
	}
	
	public void showError() {
		System.out.println("$ 비정상적인 프로그램상 에러로 프로그램이 종료됩니다.");
	}

	public static void showExampleLotto(ArrayList<ExampleLotto> exampleLottoList) {
		System.out.println("\n$ "+exampleLottoList.size()+"개의 로또 번호를 생성합니다 (숫자 1~42)");
		System.out.println("---------------------------------------------");
		System.out.println("1번째\t2번째\t3번째\t4번째\t5번째\t6번째");
		System.out.println("---------------------------------------------");

		for (ExampleLotto exampleLotto : exampleLottoList) {
			Iterator iter = exampleLotto.getBasicNumbers().iterator();
			while (iter.hasNext()) {
				System.out.print(iter.next() + "\t\t");
			}
			System.out.println();
		}

		System.out.println("---------------------------------------------\n");
	}


	public static void showWinningLotto(WinningLotto winningLotto) {
		System.out.println("$ 당첨 로또 번호를 생성합니다 6개 + 보너스 번호");
		System.out.println("---------------------------------------------");

        Iterator iter = winningLotto.getBasicNumbers().iterator();
        while(iter.hasNext()) {
			System.out.print("("+iter.next()+")  ");
        }

		System.out.println("+ ("+winningLotto.getBonusNumber()+")");
		System.out.println("---------------------------------------------\n");
	}

}
