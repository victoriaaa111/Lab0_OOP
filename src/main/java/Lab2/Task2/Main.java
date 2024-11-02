package Lab2.Task2;

import Lab2.Task1.Intensity;
import Lab2.Task1.SyrupType;

public class Main {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino("Cappuccino", Intensity.NORMAL, 50);
        cappuccino.printCoffeeDetails();

        Americano americano = new Americano(Intensity.STRONG, 50);
        americano.printCoffeeDetails();

        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.LIGHT, 60, 20);
        pumpkinSpiceLatte.printCoffeeDetails();

        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.LIGHT, 60, SyrupType.CARAMEL);
        syrupCappuccino.printCoffeeDetails();


    }
}
