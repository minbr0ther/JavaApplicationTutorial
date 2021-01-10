package se.hs.ac.view;

import se.hs.ac.vo.ExampleLotto;
import se.hs.ac.vo.WinningLotto;

import java.util.ArrayList;

public class LottoView {

    public void showQuestion() {
        System.out.print("$ 몇개의 로또를 생성하시겠습니까? \n=> ");
    }

    public void showError() {
        System.out.println("$ 비정상적인 프로그램상 에러로 프로그램이 종료됩니다.");
    }

    public static void showExampleLotto(ArrayList<ExampleLotto> exampleLottoList) {
        System.out.println("\n$ " + exampleLottoList.size() + "개의 로또 번호를 생성합니다 (숫자 1~42)");
        System.out.println("---------------------------------------------");
        System.out.println("1번째\t2번째\t3번째\t4번째\t5번째\t6번째");
        System.out.println("---------------------------------------------");

        for (ExampleLotto exampleLotto : exampleLottoList) {
            for (Integer integer : exampleLotto.getBasicNumbers()) {
                System.out.print(integer + "\t\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------\n");
    }

    public static void showWinningLotto(WinningLotto winningLotto) {
        System.out.println("$ 당첨 로또 번호를 생성합니다 6개 + 보너스 번호");
        System.out.println("---------------------------------------------");

        for (Integer integer : winningLotto.getBasicNumbers()) {
            System.out.print("(" + integer + ")  ");
        }

        System.out.println("+ (" + winningLotto.getBonusNumber() + ")");
        System.out.println("---------------------------------------------\n");
    }

    public static void showLottoRank(ExampleLotto exampleLotto, int rank) {
            System.out.println(">> " + (exampleLotto.getId() + 1) + "회차 " + rank + "등입니다 축하드립니다.");
    }
}
