package piggybank;

public class Nickel extends Coin {

    private double value;
    private int amount;

    public Nickel(int amount) {
        this.amount = amount;
        this.value = 0.05 * amount;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount + " " + (amount == 1 ? "Nickel" : "Nickels") + "\n";
    }
}