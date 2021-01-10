package se.hs.ac.vo;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WinningLotto {

    private Set<Integer> basicNumbers;
    private int bonusNumber;

    public WinningLotto(boolean randomOrExample) {
        basicNumbers = new TreeSet<Integer>();
        setBasicNumbers(randomOrExample);
        setBonusNumber(randomOrExample);
    }

    public Set<Integer> getBasicNumbers() {
        return basicNumbers;
    }

    public void setBasicNumbers(boolean randomOrExample) {
        //true: Random case, false: example case
        if (randomOrExample) {
            for (int i = 0; basicNumbers.size() < 6; i++) {
                basicNumbers.add((int) (Math.random() * 42) + 1);
            }
        } else {
            basicNumbers.clear();
            basicNumbers = new TreeSet<>(Arrays.asList(1, 2, 5, 7, 9, 10));
        }
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    public void setBonusNumber(boolean randomOrExample) {
        int tmp = 0;
        if (randomOrExample) {
            do {
                tmp = (int) (Math.random() * 42) + 1;
            } while (basicNumbers.contains(tmp));
            //베이직 넘버에 새로만든 로또번호가 포함되어 있으면 번호 다시생성, 없으면 번호 반환
            bonusNumber = tmp;
        } else {
            bonusNumber = 3;
        }
    }
}
