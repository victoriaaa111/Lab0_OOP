package Lab2.Task1;

public class Americano extends Coffee{
    private final String name = "Americano";
    private int mlOfWater;
    public Americano(int mlOfWater, Intensity coffeeIntensity) {
        super(coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }

    public String getName() {
        return name;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }
}
