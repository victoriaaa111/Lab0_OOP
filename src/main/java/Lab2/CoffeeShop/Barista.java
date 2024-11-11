package Lab2.CoffeeShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barista {
    private final Scanner scanner = new Scanner(System.in);

    public void processExistingCoffees() {
        List<Coffee> orders = new ArrayList<>();
        Coffee coffee1 = new Cappuccino("Cappuccino", Intensity.NORMAL, 50);
        Coffee coffee2 = new Americano(Intensity.STRONG, 40);
        orders.add(coffee1);
        orders.add(coffee2);
        System.out.println("Processing existing coffee order:");
        for (Coffee coffee : orders) {
            if (coffee instanceof Cappuccino) {
                ((Cappuccino) coffee).makeCappuccino();
                coffee.printCoffeeDetails();
            }
            if (coffee instanceof Americano) {
                ((Americano) coffee).makeAmericano();
                coffee.printCoffeeDetails();
            }
            if (coffee instanceof SyrupCappuccino) {
                ((SyrupCappuccino) coffee).makeSyrupCappuccino();
                coffee.printCoffeeDetails();
            }
            if (coffee instanceof PumpkinSpiceLatte) {
                ((PumpkinSpiceLatte) coffee).makePumpkinSpiceLatte();
                coffee.printCoffeeDetails();
            }

        }
    }
    public void orderCoffee(){
        List<Coffee> coffeeOrders = new ArrayList<>();
        boolean flag = true;
        while (flag){
            System.out.println("What drink would you like to order? (choose number)");
            System.out.println("1. Cappuccino");
            System.out.println("2. Americano");
            System.out.println("3. Pumpkin Spice Latte");
            System.out.println("4. Syrup Cappuccino");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    coffeeOrders.add(orderCappuccino());
                    break;
                case 2:
                    coffeeOrders.add(orderAmericano());
                    break;
                case 3:
                    coffeeOrders.add(orderPumpkinSpiceLatte());
                    break;
                case 4:
                    coffeeOrders.add(orderSyrupCappuccino());
                    break;
                default:
                    System.out.println("Sorry that drink is not available.");
                    continue;
            }
            System.out.println("Would you like to order another coffee? (yes/no)");
            scanner.nextLine();
            String answer = scanner.nextLine().trim().toLowerCase();
            if(answer.equals("no")){
                flag = false;
            }
        }
        System.out.println("All ordered coffees:");
        for (Coffee coffee : coffeeOrders) {
            coffee.printCoffeeDetails();
        }
    }

    private Coffee orderCappuccino(){
        Intensity intensity = null;
        System.out.println("Choose intensity for cappuccino: ");
        System.out.println("1.LIGHT");
        System.out.println("2.NORMAL");
        System.out.println("3.STRONG");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                intensity = Intensity.LIGHT;
                break;
                case 2:
                    intensity = Intensity.NORMAL;
                    break;
                    case 3:
                        intensity = Intensity.STRONG;
                        break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
        }
        scanner.nextLine();
        System.out.println("Enter milk quantity in ml:");
        int ml = scanner.nextInt();
        Coffee cappuccino = new Cappuccino("Cappuccino", intensity, ml);
        ((Cappuccino) cappuccino).makeCappuccino();
        return cappuccino;
    }
    private Coffee orderAmericano(){
        Intensity intensity = null;
        System.out.println("Choose intensity for americano: ");
        System.out.println("1.LIGHT");
        System.out.println("2.NORMAL");
        System.out.println("3.STRONG");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                intensity = Intensity.LIGHT;
                break;
                case 2:
                    intensity = Intensity.NORMAL;
                    break;
                    case 3:
                        intensity = Intensity.STRONG;
                        break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
        }
        scanner.nextLine();
        System.out.println("Enter water quantity in ml:");
        int ml = scanner.nextInt();
        Coffee americano = new Americano(intensity, ml);
        ((Americano) americano).makeAmericano();
        return americano;
    }

    private Coffee orderSyrupCappuccino(){
        Intensity intensity = null;
        SyrupType syrup = null;
        System.out.println("Choose intensity for syrup cappuccino: ");
        System.out.println("1.LIGHT");
        System.out.println("2.NORMAL");
        System.out.println("3.STRONG");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                intensity = Intensity.LIGHT;
                break;
            case 2:
                intensity = Intensity.NORMAL;
                break;
            case 3:
                intensity = Intensity.STRONG;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.nextLine();
        System.out.println("Enter milk quantity in ml:");
        int ml = scanner.nextInt();
        System.out.println("Enter type of syrup:");
        System.out.println("1.MACADAMIA");
        System.out.println("2.VANILLA");
        System.out.println("3.COCONUT");
        System.out.println("4.CARAMEL");
        System.out.println("5.CHOCOLATE");
        System.out.println("6.POPCORN");
        scanner.nextLine();
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                syrup = SyrupType.MACADAMIA;
                break;
                case 2:
                    syrup = SyrupType.VANILLA;
                    break;
                    case 3:
                        syrup = SyrupType.COCONUT;
                        break;
                        case 4:
                            syrup = SyrupType.CARAMEL;
                            break;
                            case 5:
                                syrup = SyrupType.CHOCOLATE;
                                break;
                                case 6:
                                    syrup = SyrupType.POPCORN;
                                    break;
                                    default:
                                        System.out.println("Invalid choice.");

        }
        Coffee syrupCappuccino = new SyrupCappuccino( intensity, ml, syrup);
        ((SyrupCappuccino) syrupCappuccino).makeSyrupCappuccino();
        return syrupCappuccino;
    }
    private Coffee orderPumpkinSpiceLatte(){
        Intensity intensity = null;
        System.out.println("Choose intensity for cappuccino: ");
        System.out.println("1.LIGHT");
        System.out.println("2.NORMAL");
        System.out.println("3.STRONG");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                intensity = Intensity.LIGHT;
                break;
            case 2:
                intensity = Intensity.NORMAL;
                break;
            case 3:
                intensity = Intensity.STRONG;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.nextLine();
        System.out.println("Enter milk quantity in ml:");
        int ml = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter pumpkin spice quantity in mg:");
        int mg = scanner.nextInt();
        Coffee pumpkinSpiceLatte = new PumpkinSpiceLatte( intensity, ml, mg);
        ((PumpkinSpiceLatte) pumpkinSpiceLatte).makePumpkinSpiceLatte();
        return pumpkinSpiceLatte;
    }

}
