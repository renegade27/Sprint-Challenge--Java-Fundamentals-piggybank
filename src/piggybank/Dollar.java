package piggybank;

public class Dollar extends AbstractMoney {

    private double value;
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
        this.value = 1.00 * amount;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "$" + amount + "\n";
    }
}