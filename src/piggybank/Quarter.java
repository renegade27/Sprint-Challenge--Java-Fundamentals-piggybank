package piggybank;

public class Quarter extends Coin {

    private double value;
    private int amount;

    public Quarter(int amount) {
        this.amount = amount;
        this.value = 0.25 * amount;
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
        return amount + " " + (amount == 1 ? "Quarter" : "Quarters") + "\n";
    }
}