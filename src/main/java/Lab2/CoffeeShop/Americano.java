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

    public void make(){
        super.make();
        System.out.println("Adding " + this.mlOfWater + "ml of water.");
    }
    public void makeAmericano() {
        this.make();
    }


    public int getMlOfWater() {
        return mlOfWater;
    }

}
