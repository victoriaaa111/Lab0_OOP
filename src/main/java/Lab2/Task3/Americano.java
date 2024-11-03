package Lab2.Task3;

import Lab2.Task1.Intensity;

public class Americano extends Coffee {
    private int mlOfWater;
    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super("Americano", coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }


    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Amount of water in " + this.name + " : " + mlOfWater + " ml");
    }

    public static Americano makeAmericano(Intensity coffeeIntensity, int mlOfWater) {
        Americano americano = new Americano(coffeeIntensity, mlOfWater);
        americano.makeCoffee();
        System.out.println("Adding " + americano.getMlOfWater() + "ml of water.");
        return americano;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

}
