package Lab2.CoffeeShop;

class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super("SyrupCappuccino", coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Syrup: " + syrup);
    }


    public SyrupType getSyrup() {
        return syrup;
    }

    public void makeSyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super.makeCappuccino("SyrupCappuccino", coffeeIntensity, mlOfMilk);
        System.out.println("Adding " + syrup + " syrup.");
    }
}
