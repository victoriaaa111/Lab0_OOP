package Lab2.Task2;

import Lab2.Task1.Intensity;

public class Coffee {
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
}
