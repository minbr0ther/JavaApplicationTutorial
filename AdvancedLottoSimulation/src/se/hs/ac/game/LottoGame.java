package se.hs.ac.game;

import se.hs.ac.vo.WinningLotto;

public class LottoGame {
    private WinningLotto winningLotto;

    public LottoGame() {
        this.winningLotto = new WinningLotto(false);
    }

    public void showWinningLotto() {
        //LottoView.showWinningLotto(winningLotto);
//        Iterator iter = winningLotto.getBasicNumbers().iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
        System.out.println(winningLotto.getBasicNumbers());
    }
}
