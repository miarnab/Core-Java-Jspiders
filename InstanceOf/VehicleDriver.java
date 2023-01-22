import java.util.*;
public class VehicleDriver {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = null;
        boolean exit = true;
        while(exit){
            System.out.println("Enter the Vehicle Name\n1. Bike\n2. Bus\n3. Helicopter\n4. Exit");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:vehicle = new Bike("Bike",2,2);
                        System.out.println(vehicle.vehicleName);
                        System.out.println(vehicle.numberOfPersons);
                        Bike bike = (Bike) vehicle;
                        System.out.println(bike.numberOfWheels);
                        break;
                case 2:vehicle = new Bus("Bus",18,8,6);
                        System.out.println(vehicle.vehicleName);
                        System.out.println(vehicle.numberOfPersons);
                        Bus bus = (Bus) vehicle;
                        System.out.println(bus.numberOfWheels);
                        System.out.println(bus.numberOfWindows);
                        break;
                case 3:vehicle = new Helicopter("Helicopter",3,4);
                        System.out.println(vehicle.vehicleName);
                        System.out.println(vehicle.numberOfPersons);
                        Helicopter helicopter = (Helicopter) vehicle;
                        System.out.println(helicopter.numberOfBlades);
                        break;
                case 4:exit = false;
                        break;
                default:System.out.println("Invalid Choice");
            }
        }
    }
}
