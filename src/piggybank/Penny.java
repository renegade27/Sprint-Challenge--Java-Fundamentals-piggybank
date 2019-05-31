package piggybank;

public class Penny extends Coin {

    private double value;
    private int amount;

    public Penny(int amount) {
        this.amount = amount;
        this.value = 0.01 * amount;
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
        return amount + " " + (amount == 1 ? "Penny" : "Pennies") + "\n";
    }
}