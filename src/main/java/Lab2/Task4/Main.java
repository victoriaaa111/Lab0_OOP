package Lab2.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Barista barista = new Barista();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Would you like the usual or to make a new order?");
    System.out.println("1. Usual");
    System.out.println("2. New Order");
    int choice = scanner.nextInt();
    switch (choice) {
        case 1:
            barista.processExistingCoffees();
            break;
        case 2:
            barista.orderCoffee();
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }
    }
}
