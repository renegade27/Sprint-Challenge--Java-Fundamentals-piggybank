package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat fp = new DecimalFormat("$###,###.00");

        Quarter quarter = new Quarter(1);
        Dime dime = new Dime(1);
        Dollar dollar = new Dollar(5);
        Nickel nickel = new Nickel(3);
        Dime dime2 = new Dime(7);
        Dollar dollar2 = new Dollar(1);
        Penny penny = new Penny(10);

        ArrayList<AbstractMoney> initArray = new ArrayList<AbstractMoney>();
        initArray.add(quarter);
        initArray.add(dime);
        initArray.add(nickel);
        initArray.add(dime2);
        initArray.add(penny);

        PiggyBank pbank = new PiggyBank(initArray);

        pbank.addContents(dollar);
        pbank.addContents(dollar2);

        System.out.println(pbank.getContents().toString());
        System.out.println("The piggy bank holds " + fp.format(pbank.getValue()));

    }
}