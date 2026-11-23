package app;

import Contracts.Serviceable;
import Devices.Printer;
import Vehicle.Car;
import Vehicle.Motorcycle;
import Vehicle.Truck;
import Vehicle.Vehicle;

public class Main {
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void performService(Serviceable item) {
        item.Service();
    }

    public static void main(String[] args) {

        // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Toyota", "Vios", 2020, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);
        System.out.println();

        // The same variable now refers to a Motorcycle object.
        vehicle = new Motorcycle("Kawasaki", " Ninja H2 Carbon", 2017,
                "998cc, liquid-cooled, 4-stroke, in-line four-cylinder supercharged gasoline engine");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        performService((Serviceable) vehicle);
        System.out.println();

        Truck Truck = new Truck("Mitsubishi", "Mitsubishi Strada / L200", 1978, 4);
        Truck.displayInfo();
        Truck.moveForward();
        Truck.moveBackward();
        Truck.moveLeft();
        Truck.moveRight();
        performService((Serviceable) Truck);

        // DEMO 2: One method accepts different Vehicle subclasses.
        System.out.println("\n=== 2. Method Parameter ===");
        Car car = new Car("Honda", "Civic", 1995, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB750 Hornet", 2022,
                "4-stroke, DOHC, 4-cylinder, liquid-cooled engine");
        Truck truck = new Truck("Hyundai", "Santa Cruz", 2021, 4);

        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();
        performService((Serviceable) car);
        System.out.println();
        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();
        performService((Serviceable) motorcycle);
        System.out.println();
        printDetails(truck);
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();
        performService((Serviceable) truck);
        System.out.print("");

        // DEMO 3: One array holds different Vehicle subclasses.
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
                new Car("Mitsubishi", "Lancer", 2010, 4),
                new Motorcycle("Yamaha", "YZF-R1M", 2015,
                        "998cc liquid-cooled, 4-stroke, DOHC,inline 4-cylinder engine featuring a crossplane crankshaft (CP4) technology"),
                new Truck("Hyundai", "Santa Cruz", 2021, 4)
        };

        Serviceable[] serviceables = {
                new Car("Mitsubishi", "Lancer", 2010, 4),
                new Motorcycle("Yamaha", "YZF-R1M", 2015,
                        "998cc liquid-cooled, 4-stroke, DOHC,inline 4-cylinder engine featuring a crossplane crankshaft (CP4) technology"),
                new Truck("Hyundai", "Santa Cruz", 2021, 4),
                new Printer()
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            performService((Serviceable) currentVehicle);
            System.out.println();
        }

        System.out.println("=== Serviceable Items ===");

        for (Serviceable currentServiceable : serviceables) {
            performService(currentServiceable);
        }
        System.out.println();
    }
}