package Lab2.Task2;

public class Cappuccino extends Coffee {
    private int mlOfMilk;
    public Cappuccino(String name, Intensity coffeeIntensity, int mlOfMilk) {
        super(name, coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }
    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Milk amount in " + this.name +" : " + mlOfMilk + " ml");
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }
}
