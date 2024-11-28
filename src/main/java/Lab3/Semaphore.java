package Lab3;

import Lab3.Task3.CarStation;
import Lab3.Task3.Car;

public class Semaphore {
    private CarStation peopleGas;
    private CarStation robotsGas;
    private CarStation peopleElectric;
    private CarStation robotsElectric;

    public Semaphore(CarStation peopleGas, CarStation peopleElectric, CarStation robotsGas, CarStation robotsElectric) {
        this.peopleGas = peopleGas;
        this.peopleElectric = peopleElectric;
        this.robotsGas = robotsGas;
        this.robotsElectric = robotsElectric;
    }

    public void sortCars(Car car){
        if(car.getPassengers() == Car.PassengerTypes.PEOPLE && car.getType() == Car.Types.GAS){
            this.peopleGas.addCar(car);
            System.out.println("Car nr. " + car.getId()+ " was assigned to People and Gas Car Station");
        }else if(car.getPassengers() == Car.PassengerTypes.PEOPLE && car.getType() == Car.Types.ELECTRIC){
            this.peopleElectric.addCar(car);
            System.out.println("Car nr. " + car.getId()+ " was assigned to People and Electric Car Station");
        }else if(car.getPassengers() == Car.PassengerTypes.ROBOTS && car.getType() == Car.Types.ELECTRIC){
            this.robotsElectric.addCar(car);
            System.out.println("Car nr. " + car.getId()+ " was assigned to Robots and Electric Car Station");
        }else if(car.getPassengers() == Car.PassengerTypes.ROBOTS && car.getType() == Car.Types.GAS){
            this.robotsGas.addCar(car);
            System.out.println("Car nr. " + car.getId()+ " was assigned to Robots and Gas Car Station");
        }
    }

    public CarStation getRobotsGas() {
        return robotsGas;
    }

    public CarStation getPeopleGas() {
        return peopleGas;
    }

    public CarStation getPeopleElectric() {
        return peopleElectric;
    }

    public CarStation getRobotsElectric() {
        return robotsElectric;
    }
}
