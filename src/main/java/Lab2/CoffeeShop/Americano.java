package Lab2.CoffeeShop;


class Americano extends Coffee{
    private int mlOfWater;
    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super("Americano", coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }


    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Amount of water in " + this.name + " : " + mlOfWater + " ml");
    }

    public void makeAmericano(Intensity coffeeIntensity, int mlOfWater) {
        super.makeCoffee(this.name, coffeeIntensity);
        System.out.println("Adding " + mlOfWater + "ml of water.");
    }


    public int getMlOfWater() {
        return mlOfWater;
    }

}
