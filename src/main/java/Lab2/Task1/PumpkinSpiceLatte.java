package Lab2.Task1;

public class PumpkinSpiceLatte extends Cappuccino{
    private int mgOfPumpkinSpice;
    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super("PumpkinSpiceLatte", coffeeIntensity, mlOfMilk);
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
