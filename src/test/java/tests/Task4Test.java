package tests;

import Lab3.Task1.ArrayImplementation;
import Lab3.Task1.DoubleStackImplementation;
import Lab3.Task2.*;
import Lab3.Task4.Semaphore;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import Lab3.Task3.Car;
import Lab3.Task3.CarStation;
import Lab3.Task1.Queue;
import Lab3.Task1.LinkedListImplementation;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;


public class Task4Test {
    public Semaphore initSemaphore() {
        //4 refuel services
        Refuelable peopleGasRefuelService = new GasStation();
        Refuelable robotsGasRefuelService = new GasStation();
        Refuelable robotsElectricRefuelService = new ElectricStation();
        Refuelable peopleElectricRefuelService = new ElectricStation();

        //4 dinner services
        Dineable peopleGasDinnerService = new PeopleDinner();
        Dineable robotsGasDinnerService = new RobotDinner();
        Dineable peopleElectricDinnerService = new PeopleDinner();
        Dineable robotsElectricDinnerService = new RobotDinner();

        //4 queues for each car station type
        Queue<Car> queue1 = new ArrayImplementation<>();
        Queue<Car> queue2= new DoubleStackImplementation<>();
        Queue<Car> queue3 = new LinkedListImplementation<>();
        Queue<Car> queue4 = new LinkedListImplementation<>();

        CarStation peopleGasStation = new CarStation(peopleGasDinnerService, peopleGasRefuelService, queue1);
        CarStation robotsGasStation = new CarStation(robotsGasDinnerService, robotsGasRefuelService, queue2);
        CarStation peopleElectricStation = new CarStation(peopleElectricDinnerService, peopleElectricRefuelService, queue3);
        CarStation robotsElectricStation = new CarStation(robotsElectricDinnerService, robotsElectricRefuelService, queue4);

        Semaphore semaphore = new Semaphore(peopleGasStation,peopleElectricStation, robotsGasStation, robotsElectricStation);

        return semaphore;
    }
    @Test
    public void testSemaphore(){
        Semaphore semaphore = initSemaphore();
        ObjectMapper mapper = new ObjectMapper();

        String carsJson = """
                [
                      {"id": 1, "type": "GAS", "passengers": "ROBOTS", "isDining": false, "consumption": 30},
                      {"id": 2, "type": "ELECTRIC", "passengers": "PEOPLE", "isDining": true, "consumption": 42},
                      {"id": 3, "type": "ELECTRIC", "passengers": "PEOPLE", "isDining": true, "consumption": 23},
                      {"id": 4, "type": "GAS", "passengers": "ROBOTS", "isDining": false, "consumption": 40},
                      {"id": 5, "type": "GAS", "passengers": "PEOPLE", "isDining": false, "consumption": 14},
                      {"id": 6, "type": "ELECTRIC", "passengers": "PEOPLE", "isDining": false, "consumption": 26}
                ]
                """;

        Queue<Car> waitingCars = new LinkedListImplementation<>();

        try {
            List<Car> cars = mapper.readValue(carsJson, new TypeReference<List<Car>>(){});
            for(Car car : cars){
                waitingCars.enqueue(car);
            }
            while(!waitingCars.isEmpty()){
               semaphore.sortCars(waitingCars.peek());
               waitingCars.dequeue();
            }
            System.out.println("Finished assigning cars");

            Assertions.assertEquals(3, semaphore.getPeopleElectric().getQueue().size());
            Assertions.assertEquals(1, semaphore.getPeopleGas().getQueue().size());
            Assertions.assertEquals(2, semaphore.getRobotsGas().getQueue().size());
            Assertions.assertEquals(0, semaphore.getRobotsElectric().getQueue().size());

            Assertions.assertTrue(waitingCars.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testGasCars(){
        Semaphore semaphore = initSemaphore();
        ObjectMapper mapper = new ObjectMapper();

        String carsJson = """
                [
                      {"id": 1, "type": "GAS", "passengers": "ROBOTS", "isDining": true, "consumption": 30},
                      {"id": 2, "type": "GAS", "passengers": "ROBOTS", "isDining": false, "consumption": 40},
                      {"id": 3, "type": "GAS", "passengers": "PEOPLE", "isDining": true, "consumption": 14},
                      {"id": 4, "type": "GAS", "passengers": "PEOPLE", "isDining": false, "consumption": 26}
                ]
                """;

        Queue<Car> waitingCars = new LinkedListImplementation<>();

        try {
            List<Car> cars = mapper.readValue(carsJson, new TypeReference<List<Car>>(){});
            for(Car car : cars){
                waitingCars.enqueue(car);
            }
            while(!waitingCars.isEmpty()){
                semaphore.sortCars(waitingCars.peek());
                waitingCars.dequeue();
            }
            System.out.println("Finished assigning cars");

            Assertions.assertEquals(2, semaphore.getPeopleGas().getQueue().size());
            Assertions.assertEquals(2, semaphore.getRobotsGas().getQueue().size());
            Assertions.assertTrue(semaphore.getRobotsElectric().getQueue().isEmpty());
            Assertions.assertTrue(semaphore.getPeopleElectric().getQueue().isEmpty());

            Assertions.assertTrue(waitingCars.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testElectricCars(){
        Semaphore semaphore = initSemaphore();
        ObjectMapper mapper = new ObjectMapper();

        String carsJson = """
                [
                      {"id": 1, "type": "ELECTRIC", "passengers": "ROBOTS", "isDining": true, "consumption": 30},
                      {"id": 2, "type": "ELECTRIC", "passengers": "ROBOTS", "isDining": false, "consumption": 40},
                      {"id": 3, "type": "ELECTRIC", "passengers": "PEOPLE", "isDining": true, "consumption": 14},
                      {"id": 4, "type": "ELECTRIC", "passengers": "PEOPLE", "isDining": false, "consumption": 26}
                ]
                """;

        Queue<Car> waitingCars = new LinkedListImplementation<>();

        try {
            List<Car> cars = mapper.readValue(carsJson, new TypeReference<List<Car>>(){});
            for(Car car : cars){
                waitingCars.enqueue(car);
            }
            while(!waitingCars.isEmpty()){
                semaphore.sortCars(waitingCars.peek());
                waitingCars.dequeue();
            }
            System.out.println("Finished assigning cars");

            Assertions.assertEquals(2, semaphore.getPeopleElectric().getQueue().size());
            Assertions.assertEquals(2, semaphore.getRobotsElectric().getQueue().size());
            Assertions.assertTrue(semaphore.getRobotsGas().getQueue().isEmpty());
            Assertions.assertTrue(semaphore.getPeopleGas().getQueue().isEmpty());

            Assertions.assertTrue(waitingCars.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
