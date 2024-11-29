package Lab3.Task3;

import Lab3.Task2.Dineable;
import Lab3.Task2.Refuelable;
import Lab3.Task1.Queue;

public class CarStation {
    private Dineable diningService;
    private Refuelable refuelingService;
    private Queue<Car> queue;

    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }

    public void serveCars(){
        Car car = new Car();
        while (!this.queue.isEmpty()){
            car = this.queue.peek();
            System.out.println("\n ###############");
            System.out.println("Serving car " + car.getId());
            if(car.getIsDining()){
                diningService.serveDinner(car.getId());
            }
            refuelingService.refuel(car.getId());
            System.out.println("Finished serving car " + car.getId() + ".");
            this.queue.dequeue();
        }
        System.out.println("No cars in queue to be served");
    }

    public void addCar(Car car){
        this.queue.enqueue(car);
    }

    public Dineable getDiningService() {
        return diningService;
    }

    public Refuelable getRefuelingService() {
        return refuelingService;
    }

    public Queue<Car> getQueue() {
        return queue;
    }
}
