package Lab2.CoffeeShop;

class Cappuccino extends Coffee {
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

    public void makeCappuccino(String name,Intensity coffeeIntensity, int mlOfMilk) {
        super.makeCoffee(name, coffeeIntensity);
        System.out.println("Adding " + mlOfMilk + "ml of milk.");
    }
}
