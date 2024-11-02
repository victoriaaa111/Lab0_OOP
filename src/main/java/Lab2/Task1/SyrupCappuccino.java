package Lab2.Task1;

public class SyrupCappuccino extends Cappuccino {
    private final String name = "SyrupCappuccino";
    private SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    @Override
    public String getName() {
        return name;
    }

    public SyrupType getSyrup() {
        return syrup;
    }
}
