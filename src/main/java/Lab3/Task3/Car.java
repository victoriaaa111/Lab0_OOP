package Lab3.Task3;

public class Car {
    private int id;
    private Types type;
    private PassengerTypes passengers;
    private boolean isDining;
    private int consumption;

    public enum Types{
        ELECTRIC, GAS
    }
    public enum PassengerTypes{
        PEOPLE, ROBOTS
    }


    public Car(int id, Types type, PassengerTypes passengers, boolean isDining, int consumption) {
        this.id = id;
        this.type = type;
        this.passengers = passengers;
        this.isDining = isDining;
        this.consumption = consumption;
    }

    public Car(){}

    public int getId() {
        return id;
    }

    public Types getType() {
        return type;
    }

    public PassengerTypes getPassengers() {
        return passengers;
    }

    public boolean isDining() {
        return isDining;
    }

    public int getConsumption() {
        return consumption;
    }
}
