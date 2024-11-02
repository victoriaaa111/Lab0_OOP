package Lab2.Task2;

public class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice;
    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super("PumpkinSpiceLatte", coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }


    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Pumpkin Spice: " + mgOfPumpkinSpice +"mg \n");
    }

    @Override
    public String getName() {
        return name;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }
}
