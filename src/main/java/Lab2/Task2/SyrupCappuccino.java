package Lab2.Task2;

public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super("SyrupCappuccino", coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Syrup: " + syrup);
    }
    @Override
    public String getName() {
        return name;
    }

    public SyrupType getSyrup() {
        return syrup;
    }
}
