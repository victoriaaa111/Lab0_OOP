package Lab2.Task3;

import Lab2.Task1.Intensity;


public class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice;
    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super("PumpkinSpiceLatte", coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }


    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Pumpkin Spice: " + mgOfPumpkinSpice +" mg \n");
    }


    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    public static PumpkinSpiceLatte makePumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        Cappuccino pumpkinSpice = makeCappuccino("PumpkinSpiceLatte", coffeeIntensity, mlOfMilk);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(pumpkinSpice.getCoffeeIntensity(), pumpkinSpice.getMlOfMilk(), mgOfPumpkinSpice);
        System.out.println("Adding " + pumpkinSpiceLatte.getMgOfPumpkinSpice() + " mg of pumpkin spice.");
        return pumpkinSpiceLatte;
    }
}
