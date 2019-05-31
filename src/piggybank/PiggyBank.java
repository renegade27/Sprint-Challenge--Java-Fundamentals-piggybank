package piggybank;

import java.util.*;

public class PiggyBank {

    private ArrayList<AbstractMoney> contents;
    private double value;

    public double findValue(ArrayList<AbstractMoney> array) {
        for(AbstractMoney money : array) {
            value += money.getValue();
        }
        return value;
    }

    public PiggyBank(ArrayList<AbstractMoney> contents) {
        this.contents = contents;
        this.value = findValue(contents);
    }

    public ArrayList<AbstractMoney> getContents() {
        return contents;
    }

    public double getValue() {
        this.value = 0.0;
        return findValue(contents);
    }

    public void addContents(AbstractMoney money) {
        this.contents.add(money);
    }
}