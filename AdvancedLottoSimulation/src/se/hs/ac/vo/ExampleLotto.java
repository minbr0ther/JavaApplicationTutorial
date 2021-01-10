package se.hs.ac.vo;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExampleLotto {

    private int id;
    private Set<Integer> basicNumbers;
    private int matchCount;
    private int rank;

    public ExampleLotto(int id, boolean randomOrExample) {
        this.id = id;
        basicNumbers = new TreeSet<Integer>();
        setBasicNumbers(randomOrExample);
        matchCount = 0;
        rank = 0;
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
            basicNumbers = new TreeSet<>(Arrays.asList(1, 2, 5, 6, 8, 9));
        }
    }

    public int getMatchCount() {
        return matchCount;
    }

    public void addMatchCount(int matchCount) {
        this.matchCount += matchCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
