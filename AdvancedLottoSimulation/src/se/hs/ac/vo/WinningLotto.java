package se.hs.ac.vo;

import java.util.Set;
import java.util.TreeSet;

public class WinningLotto {

    private Set<Integer> basicNumbers;
    private int bonusNumber;

    public WinningLotto(boolean randomOrExample) {
        basicNumbers = new TreeSet<Integer>();
        setBasicNumbers(randomOrExample);
        setBonusNumber();
    }

    public Set<Integer> getBasicNumbers() {
        return basicNumbers;
    }

    public void setBasicNumbers(boolean randomOrExample) {
        //public void setBasicNumbers(BasicNumbers basicnumbers);
        //true: Random case, false: example case
        if(randomOrExample) {
            for (int i = 0; basicNumbers.size() < 6; i++) {
                int exampleNum = (int) (Math.random() * 42) + 1;
                basicNumbers.add(exampleNum);
            }
        }
        else {
            basicNumbers.clear();
            basicNumbers = new TreeSet<>();
            for(int i=1;i<7; i++){
                basicNumbers.add(i);
            }
        }
    }


    public int getBonusNumber() {
        return bonusNumber;
    }

    public void setBonusNumber() {
        int exampleNum = 0;
        do {
           exampleNum = (int) (Math.random() * 42) + 1;
        }while(basicNumbers.contains(exampleNum));
        //베이직 넘버에 새로만든 로또번호가 포함되어 있으면 번호 다시생성, 없으면 번호 반환
        bonusNumber = exampleNum;
    }

    @Override
    public String toString() {
        return "WinningLotto{" +
                "basicNumbers=" + basicNumbers +
                ", bonusNumber=" + bonusNumber +
                '}';
    }
}
