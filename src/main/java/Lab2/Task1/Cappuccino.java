package Lab2.Task1;

public class Cappuccino extends Coffee{
    private int mlOfMilk;
    private final String name = "Cappuccino";
    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    @Override
    public String getName() {
        return name;
    }
}
