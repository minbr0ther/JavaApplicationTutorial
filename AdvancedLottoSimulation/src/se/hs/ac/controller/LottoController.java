package se.hs.ac.controller;

import se.hs.ac.game.LottoGame;
import se.hs.ac.view.LottoView;
import se.hs.ac.vo.ExampleLotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LottoController {

    private final LottoView lottoView;
    private final LottoGame lottoGame;

    public LottoController() {
        this.lottoView = new LottoView();
        this.lottoGame = new LottoGame();
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            lottoView.showQuestion();
            int num = Integer.parseInt(br.readLine());

            LottoView.showExampleLotto((ArrayList<ExampleLotto>) lottoGame.generateExampleLotto(num));

            LottoView.showWinningLotto(lottoGame.generateWinningLotto());

            List<ExampleLotto> exampleLotto = lottoGame.generateWinningList();

            for (ExampleLotto example : exampleLotto) {
                if (example.getRank() > 0) {
                    LottoView.showLottoRank(example, example.getRank());
                }
            }
        } catch (IOException e) {
            lottoView.showError();
        }
    }
}
