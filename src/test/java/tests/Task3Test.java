package tests;

import Lab3.Task1.ArrayImplementation;
import Lab3.Task1.DoubleStackImplementation;
import Lab3.Task1.LinkedListImplementation;
import Lab3.Task2.*;
import Lab3.Task3.Car;
import Lab3.Task1.Queue;
import Lab3.Task3.CarStation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Test {
    @Test
    public void TestServing() {
        Refuelable gasStation = new GasStation();
        Refuelable electricStation = new ElectricStation();

        Dineable peopleDinner = new PeopleDinner();
        Dineable robotDinner = new RobotDinner();

        Car car1 = new Car(1, "GAS", "PEOPLE", true, 42);
        Car car2 = new Car(2, "ELECTRIC", "PEOPLE", true, 22);
        Car car3 = new Car(3, "ELECTRIC", "ROBOTS", true, 12);
        Car car4 = new Car(4, "GAS", "PEOPLE", false, 65);

        Queue<Car> queueArray = new ArrayImplementation<Car>();
        Queue<Car> queueDoubleStack = new DoubleStackImplementation<Car>();
        Queue<Car> queueLikedList = new LinkedListImplementation<Car>();

        CarStation carStationPeopleGas = new CarStation(peopleDinner, gasStation, queueArray);
        CarStation carStationPeopleElectric = new CarStation(peopleDinner, electricStation, queueDoubleStack);
        CarStation carStationRobotsElectric = new CarStation(robotDinner, electricStation, queueLikedList);

        carStationPeopleGas.addCar(car1);
        carStationPeopleGas.addCar(car4);
        carStationPeopleElectric.addCar(car2);
        carStationRobotsElectric.addCar(car3);

        Assertions.assertEquals(1, carStationPeopleElectric.getQueue().size());
        Assertions.assertEquals(2, carStationPeopleGas.getQueue().size());
        Assertions.assertEquals(1, carStationRobotsElectric.getQueue().size());

        carStationPeopleGas.serveCars();
        Assertions.assertTrue(carStationPeopleGas.getQueue().isEmpty());
        Assertions.assertFalse(carStationPeopleElectric.getQueue().isEmpty());
        Assertions.assertFalse(carStationRobotsElectric.getQueue().isEmpty());

        carStationPeopleElectric.serveCars();
        carStationRobotsElectric.serveCars();

        Assertions.assertTrue(carStationPeopleElectric.getQueue().isEmpty());
        Assertions.assertTrue(carStationRobotsElectric.getQueue().isEmpty());

        Assertions.assertEquals(2, ((PeopleDinner) carStationPeopleGas.getDiningService()).getPeopleServedCount());
        Assertions.assertEquals(2, ((ElectricStation) carStationPeopleElectric.getRefuelingService()).getElectricCarsCount());
        Assertions.assertEquals(2, ((GasStation) carStationPeopleGas.getRefuelingService()).getGasCarsCount());
        Assertions.assertEquals(1, ((RobotDinner) carStationRobotsElectric.getDiningService()).getRobotsServedCount());
    }

    @Test
    public void TestServeTwice(){
        Refuelable gasStation = new GasStation();
        Dineable peopleDinner = new PeopleDinner();

        Car car1 = new Car(1, "GAS", "PEOPLE", true, 42);
        Car car2 = new Car(2, "GAS", "PEOPLE", false, 65);

        Queue<Car> queueDoubleStack = new DoubleStackImplementation<Car>();

        CarStation carStationPeopleGas = new CarStation(peopleDinner, gasStation, queueDoubleStack);

        carStationPeopleGas.addCar(car1);
        carStationPeopleGas.addCar(car2);

        carStationPeopleGas.serveCars();

        Assertions.assertTrue(carStationPeopleGas.getQueue().isEmpty());

        carStationPeopleGas.addCar(car1);
        carStationPeopleGas.addCar(car2);

        Assertions.assertEquals(2, carStationPeopleGas.getQueue().size());

        carStationPeopleGas.serveCars();
        Assertions.assertTrue(carStationPeopleGas.getQueue().isEmpty());
    }

}
