package piggybank;

public abstract class AbstractMoney {

    private static int minId = 0;

    public int id;

    public AbstractMoney() {
        this.id = minId++;
    }

    public abstract int getAmount();
    public abstract double getValue();

    public int getId() {
        return id;
    }

}