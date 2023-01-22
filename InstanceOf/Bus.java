public class Bus extends Vehicle {
    int numberOfWheels;
    int numberOfWindows;

    public Bus(String vehicleName, int numberOfPersons, int numberOfWheels, int numberOfWindows) {
        super(vehicleName, numberOfPersons);
        this.numberOfWheels = numberOfWheels;
        this.numberOfWindows = numberOfWindows;
    }
}
