package Lab2.Task1;

public class Americano extends Coffee{
    private int mlOfWater;
    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super("Americano", coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }

    public String getName() {
        return name;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }
}
