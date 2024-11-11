package Lab2.CoffeeShop;


class PumpkinSpiceLatte extends Cappuccino {
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

    public void make(){
        super.make();
        System.out.println("Adding " + this.mgOfPumpkinSpice + " mg of pumpkin spice.");
    }

    public void makePumpkinSpiceLatte() {
        this.make();
    }
}
