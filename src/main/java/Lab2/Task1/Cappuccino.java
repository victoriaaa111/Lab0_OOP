package Lab2.Task1;

public class Cappuccino extends Coffee{
    private int mlOfMilk;
    public Cappuccino(String name, Intensity coffeeIntensity, int mlOfMilk) {
        super(name, coffeeIntensity);
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
