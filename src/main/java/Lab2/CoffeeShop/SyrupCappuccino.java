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

    public void make(){
        super.make();
        System.out.println("Adding " + this.syrup + " syrup.");
    }


    public void makeSyrupCappuccino() {
        this.make();
    }
}
