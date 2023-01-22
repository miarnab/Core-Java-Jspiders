public class Bike extends Vehicle {
    int numberOfWheels;

    public Bike(String vehicleName, int numberOfPersons, int numberOfWheels) {
        super(vehicleName, numberOfPersons);
        this.numberOfWheels = numberOfWheels;
    }
}
