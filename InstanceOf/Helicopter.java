public class Helicopter extends Vehicle{
    int numberOfBlades;

    public Helicopter(String vehicleName, int numberOfPersons, int numberOfBlades) {
        super(vehicleName, numberOfPersons);
        this.numberOfBlades = numberOfBlades;
    }
}
