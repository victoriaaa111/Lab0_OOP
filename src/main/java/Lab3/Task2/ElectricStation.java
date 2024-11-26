package Lab3.Task2;

public class ElectricStation implements Refuelable{
    private static int electricCarsCount = 0;
    @Override
    public void refuel(String carId){
        System.out.println("Refueling electric car " + carId + ".");
        electricCarsCount++;
    }
    public static int getElectricCarsCount() {
        return electricCarsCount;
    }
}
