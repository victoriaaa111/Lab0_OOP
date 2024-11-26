package tests;

import Lab3.Task2.ElectricStation;
import Lab3.Task2.GasStation;
import Lab3.Task2.PeopleDinner;
import Lab3.Task2.RobotDinner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {
    @Test
    public void testDining(){
        PeopleDinner peopleDinner1 = new PeopleDinner();
        PeopleDinner peopleDinner2 = new PeopleDinner();
        RobotDinner robotDinner1 = new RobotDinner();
        RobotDinner robotDinner2 = new RobotDinner();

        peopleDinner1.serveDinner("1");
        peopleDinner1.serveDinner("2");
        peopleDinner2.serveDinner("3");
        Assertions.assertEquals(3, PeopleDinner.getPeopleServedCount());

        robotDinner2.serveDinner("4");
        robotDinner1.serveDinner("5");
        robotDinner2.serveDinner("6");
        robotDinner1.serveDinner("7");
        Assertions.assertEquals(4, RobotDinner.getRobotsServedCount());
    }

    @Test
    public void testRefuel(){
        ElectricStation electricStation1 = new ElectricStation();
        ElectricStation electricStation2 = new ElectricStation();
        GasStation gasStation1 = new GasStation();
        GasStation gasStation2 = new GasStation();

        electricStation1.refuel("1");
        electricStation2.refuel("2");
        electricStation2.refuel("3");

        Assertions.assertEquals(3, ElectricStation.getElectricCarsCount());

        gasStation1.refuel("4");
        gasStation2.refuel("5");

        Assertions.assertEquals(2, GasStation.getGasCarsCount());
    }
}
