package piggybank;

public abstract class Coin extends AbstractMoney {

    private String type;

    public Coin() {
        this.type = "coin";
    }

    public abstract double getValue();
    public abstract int getAmount();

    public String getType() {
        return type;
    }
}