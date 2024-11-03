package Lab2.Task3;

import Lab2.Task1.Intensity;
import Lab2.Task1.SyrupType;

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


    public SyrupType getSyrup() {
        return syrup;
    }

    public static SyrupCappuccino makeSyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        Cappuccino syrupCappuccino = makeCappuccino("SyrupCappuccino", coffeeIntensity, mlOfMilk);
        SyrupCappuccino syrupCp = new SyrupCappuccino(syrupCappuccino.getCoffeeIntensity(), syrupCappuccino.getMlOfMilk(), syrup);
        System.out.println("Adding " + syrupCp.getSyrup() + " syrup.");
        return syrupCp;
    }
}
