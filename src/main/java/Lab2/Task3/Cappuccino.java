package Lab2.Task3;

import Lab2.Task1.Intensity;

public class Cappuccino extends Coffee {
    private int mlOfMilk;
    public Cappuccino(String name, Intensity coffeeIntensity, int mlOfMilk) {
        super(name, coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Milk amount in " + this.name +" : " + mlOfMilk + " ml");
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public static Cappuccino makeCappuccino(String name,Intensity coffeeIntensity, int mlOfMilk) {
        Cappuccino cappuccino = new Cappuccino(name, coffeeIntensity, mlOfMilk);
        cappuccino.makeCoffee();
        System.out.println("Adding " + cappuccino.getMlOfMilk() + "ml of milk.");
        return cappuccino;
    }
}
