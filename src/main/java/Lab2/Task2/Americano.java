package Lab2.Task2;

public class Americano extends Coffee {
    private int mlOfWater;
    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super("Americano", coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Amount of water in " + this.name + " : " + mlOfWater + " ml");
    }

    public int getMlOfWater() {
        return mlOfWater;
    }
}
