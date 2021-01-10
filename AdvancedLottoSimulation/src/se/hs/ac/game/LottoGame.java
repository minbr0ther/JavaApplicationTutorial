package se.hs.ac.game;

import se.hs.ac.vo.ExampleLotto;
import se.hs.ac.vo.WinningLotto;

import java.util.ArrayList;
import java.util.List;

public class LottoGame {

    private final List<ExampleLotto> exampleLottoList = new ArrayList<>();
    private final WinningLotto winningLotto;

    public LottoGame() {
        ExampleLotto exampleLotto = new ExampleLotto(0, true); //input test case first
        winningLotto = new WinningLotto(true);
    }

    public List<ExampleLotto> generateExampleLotto(int num) {
        for (int i = 0; i < num; i++) { // test case exception
            int id = i;
            exampleLottoList.add(new ExampleLotto(++id, true));
        }
        return exampleLottoList;
    }

    public WinningLotto generateWinningLotto() {
        return winningLotto;
    }

    public List<ExampleLotto> generateWinningList() {
        addMatchCount();
        return showLottoRank();
    }

    private void addMatchCount() {
        for (ExampleLotto exampleLotto : exampleLottoList) {
            for (Integer integer : winningLotto.getBasicNumbers()) {
                if (exampleLotto.getBasicNumbers().contains(integer)) {
                    exampleLotto.addMatchCount(1);
                }
            }
        }
    }

    private List<ExampleLotto> showLottoRank() {
        for (ExampleLotto exampleLotto : exampleLottoList) {
            int cnt = exampleLotto.getMatchCount();
            int bonusNum = winningLotto.getBonusNumber();

            if (cnt == 6) {
                exampleLotto.setRank(1);
            } else if (cnt == 5) {
                if (exampleLotto.getBasicNumbers().contains(bonusNum)) {
                    exampleLotto.setRank(2);
                } else {
                    exampleLotto.setRank(3);
                }
            } else if (cnt == 4) {
                exampleLotto.setRank(4);
            } else if (cnt == 3) {
                exampleLotto.setRank(5);
            }
        }
        return exampleLottoList;
    }
}
