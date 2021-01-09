package se.hs.ac.controller;

import se.hs.ac.game.LottoGame;
import se.hs.ac.view.LottoView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LottoController {

    private final LottoView lottoView;
    private LottoGame lottoGame;

    public LottoController() {
        this.lottoView = new LottoView();
        this.lottoGame = new LottoGame();
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            while (true) {
                //lottoView.showQuestion();
                //int num = Integer.parseInt(br.readLine());

                lottoGame.showWinningLotto();
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}