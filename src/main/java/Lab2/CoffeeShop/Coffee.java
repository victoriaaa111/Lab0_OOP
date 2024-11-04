package Lab2.CoffeeShop;

class Coffee {
    private Intensity coffeeIntensity;
    protected final String name;
    public Coffee(String name, Intensity coffeeIntensity) {
        this.name = name;
        this.coffeeIntensity = coffeeIntensity;
    }
    public Intensity getCoffeeIntensity() {
        return coffeeIntensity;
    }
    public String getName() {
        return name;
    }
    public void printCoffeeDetails(){
        System.out.println("\nDetails:");
        System.out.println("Coffee Type: " + this.name);
        System.out.println(this.name + " intensity: " + coffeeIntensity);
    }

    public void makeCoffee(String name, Intensity coffeeIntensity) {
        System.out.println("\n#######");
        System.out.println("Making " + name + ":");
        System.out.println("Intensity set to: " + coffeeIntensity);
    }
}
