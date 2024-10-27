package Lab1.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Display display1 = new Display(1179,2556, 460, "iPhone 16");
        Display display2 = new Display(2560, 1664, 224, "MacBook Air 2022");
        Display display3 = new Display(3840, 2160, 163, "Dell UltraSharp U2720Q");

        System.out.println("\nChoose what criteria you want to compare the displays by: \n");
        System.out.println("\n1. Screen Size\n");
        System.out.println("2. Screen Sharpness\n");
        System.out.println("3. Both\n");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\nComparison by screen sizes:");
                System.out.println("\n# Between " + display1.getModel() + " and " + display2.getModel()+"\n");
                display1.compareSize(display2);
                System.out.println("\n# Between " + display1.getModel() + " and " + display3.getModel()+"\n");
                display1.compareSize(display3);
                System.out.println("\n# Between " + display2.getModel() + " and " + display3.getModel()+"\n");
                display2.compareSize(display3);
                break;
            case 2:
                System.out.println("\nComparison by screen sharpness:\n");
                System.out.println("\n# Between " + display1.getModel() + " and " + display2.getModel()+"\n");
                display1.compareSharpness(display2);
                System.out.println("\n# Between " + display1.getModel() + " and " + display3.getModel()+"\n");
                display1.compareSharpness(display3);
                System.out.println("\n# Between " + display2.getModel() + " and " + display3.getModel()+"\n");
                display2.compareSharpness(display3);
                break;
            case 3:
                System.out.println("\nComparison by both size and sharpness:\n");
                display1.compareWithMonitor(display2);
                display1.compareWithMonitor(display3);
                display2.compareWithMonitor(display3);
                break;
            default:
                System.out.println("\nInvalid choice, please try again\n");
                break;
        }
        scanner.close();
    }
}
