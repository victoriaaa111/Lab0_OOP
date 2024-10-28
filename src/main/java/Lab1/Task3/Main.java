package Lab1.Task3;

import Lab1.Task1.Display;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(1179,2556, 460, "iPhone 16");
        Display display2 = new Display(2560, 1664, 224, "MacBook Air 2022");
        Display display3 = new Display(3840, 2160, 163, "Dell UltraSharp U2720Q");
        Display display4 = new Display(1920, 1080, 401, "Samsung Galaxy S21");
        Display display5 = new Display(2560, 1440, 109, "LG UltraFine 5K");

        Scanner scanner = new Scanner(System.in);

        Assistant assistant = new Assistant("Victoria");
        assistant.assignDisplay(display1);
        assistant.assignDisplay(display2);
        assistant.assignDisplay(display3);
        assistant.assignDisplay(display4);
        assistant.assignDisplay(display5);

        List<Display> displays = assistant.getAssignedDisplays();

        assistant.assist();

        System.out.println("Choose a display to buy by entering the corresponding number:");
        for (int i = 0; i < displays.size(); i++) {
            System.out.println((i + 1) + ". " + displays.get(i).getModel());
        }

        int choice = scanner.nextInt();

        if(choice > 0 && choice <= displays.size()) {
            Display chosenDisplay = displays.get(choice - 1);
            Display boughtDisplay = assistant.buyDisplay(chosenDisplay);
            if(boughtDisplay != null) {
                System.out.println("########");
                System.out.println("\nBought Display: \n");
                System.out.println("    1.Model : "+ boughtDisplay.getModel());
                System.out.println("    2.Width : "+ boughtDisplay.getWidth());
                System.out.println("    3.Height : "+ boughtDisplay.getHeight());
                System.out.println("    4.PPI : "+ boughtDisplay.getPpi());
                System.out.println("    5.Model : "+ boughtDisplay.getModel());
            }else{
                System.out.println("Display does not exist");
            }
        }else{
            System.out.println("Invalid choice. Try again.");
        }
        scanner.close();
        System.out.println("\n########");
        System.out.println("\nLeft displays:");
        for (int i = 0; i < displays.size(); i++) {
            System.out.println((i + 1) + ". " + displays.get(i).getModel());
        }
    }
}
