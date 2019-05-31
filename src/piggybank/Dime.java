package piggybank;

public class Dime extends Coin {

    private double value;
    private int amount;

    public Dime(int amount) {
        this.amount = amount;
        this.value = 0.10 * amount;
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
        return amount + " " + (amount == 1 ? "Dime" : "Dimes") + "\n";
    }
}