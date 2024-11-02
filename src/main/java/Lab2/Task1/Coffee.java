package Lab2.Task1;

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
}