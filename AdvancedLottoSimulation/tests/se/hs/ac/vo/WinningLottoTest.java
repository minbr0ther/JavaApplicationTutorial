package se.hs.ac.vo;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WinningLottoTest {

    public static WinningLotto winningLotto;

    @BeforeClass
    public static void makeInstance()throws Exception {
        winningLotto = new WinningLotto(true);
    }
    @Test
    public void getBasicNumbers() {
        assertEquals(20,winningLotto.getBasicNumbers());
    }

    @Test
    public void setBasicNumbers() throws Exception{
        winningLotto.setBasicNumbers(false);
    }

    @Test
    public void getBonusNumber() {
    }

    @Test
    public void setBonusNumber() {
    }
}