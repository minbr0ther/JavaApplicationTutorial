package se.hs.ac.game;

import se.hs.ac.view.LottoView;
import se.hs.ac.vo.ExampleLotto;
import se.hs.ac.vo.WinningLotto;

import java.util.ArrayList;
import java.util.Iterator;

public class LottoGame {

    private final static ArrayList<ExampleLotto> exampleLottoList = new ArrayList();
    private final ExampleLotto exampleLotto;
    private final WinningLotto winningLotto;

    public LottoGame() {
        exampleLotto = new ExampleLotto(0,true); //input test case first
        winningLotto = new WinningLotto(true);
    }

    public void generateExampleLotto(int num) {
        exampleLottoList.add(exampleLotto);
        for(int i=0; i<num; i++){ // test case exception
            int id = i;
            exampleLottoList.add(new ExampleLotto(++id,true));
        }
        LottoView.showExampleLotto(exampleLottoList);
    }

    public void generateWinningLotto() {
        LottoView.showWinningLotto(winningLotto);
    }

    public void generateWinningList() {

        for (ExampleLotto exampleLotto : exampleLottoList) {
            Iterator winningIter = winningLotto.getBasicNumbers().iterator();
            while(winningIter.hasNext()) {
                if (exampleLotto.getBasicNumbers().contains(winningIter.next())) {
                    exampleLotto.addMatchCount(1);
                }
            }
        }

        LottoView.showLottoRank(exampleLottoList, winningLotto);
    }
}
