package Lab2.Task3;

import Lab2.Task1.Intensity;
import Lab2.Task1.SyrupType;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = Cappuccino.makeCappuccino("Cappuccino", Intensity.NORMAL, 60);
        System.out.println("Done!");
        if (coffee1 instanceof Cappuccino) {
            ((Cappuccino) coffee1).printCoffeeDetails();
        }

        Coffee coffee2 = Americano.makeAmericano(Intensity.STRONG, 60);
        System.out.println("Done!");
        if (coffee2 instanceof Americano) {
            ((Americano) coffee2).printCoffeeDetails();
        }

        Coffee coffee3 = SyrupCappuccino.makeSyrupCappuccino(Intensity.LIGHT, 60, SyrupType.COCONUT);
        System.out.println("Done!");
        if (coffee3 instanceof SyrupCappuccino) {
            ((SyrupCappuccino) coffee3).printCoffeeDetails();
        }

        Coffee coffee4 = PumpkinSpiceLatte.makePumpkinSpiceLatte(Intensity.LIGHT, 70, 20);
        System.out.println("Done!");
        if (coffee4 instanceof PumpkinSpiceLatte) {
            ((PumpkinSpiceLatte) coffee4).printCoffeeDetails();
        }
    }
}
