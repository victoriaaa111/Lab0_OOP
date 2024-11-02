package Lab2.Task1;

public class PumpkinSpiceLatte extends Cappuccino{
    private final String name = "PumpkinSpiceLatte";
    private int mgOfPumpkinSpice;
    public PumpkinSpiceLatte(int mgOfPumpkinSpice, Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }
}
