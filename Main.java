public class Main {

    public static void printDetails(Vehicle vehicle){
    vehicle.displayInfo();
    }
	public static void main(String[] args) {
		
        System.out.println("===1. Parent Reference ===");
		Vehicle vehicle = new Car("Toyota", "Vios", 2020,4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        vehicle = new Motorcycle ("Kawasaki"," Ninja H2 Carbon",2017, "998cc, liquid-cooled, 4-stroke, in-line four-cylinder supercharged gasoline engine");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();

        Truck truck = new Truck ("Mitsubishi", "Mitsubishi Strada / L200",1978,4);
        truck.displayInfo();
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();

        System.out.println("\n=== 2. Method Parameter ===");
        Car Car = new Car("Honda", "Civic",1995,4);
        Motorcycle Motor = new Motorcycle("Honda", "CB750 Hornet",2022, "4-stroke, DOHC, 4-cylinder, liquid-cooled engine");
        Truck Truck = new Truck ("Hyundai","Santa Cruz",2021,4);
        printDetails(Car);
        Car.moveForward();
        Car.moveBackward();
        Car.moveLeft();
        Car.moveRight();
        printDetails(Motor);
        Motor.moveForward();
        Motor.moveBackward();
        Motor.moveLeft();
        Motor.moveRight();
        printDetails(Truck);
        Truck.moveForward();
        Truck.moveBackward();
        Truck.moveLeft();
        Truck.moveRight();

        System.out.println("\n=== 3.Polymorphic Array ===");
        Vehicle[] vehicles = {
            new Car("Mitsubishi", "Lancer", 2010,4),
            new Motorcycle("Yamaha","YZF-R1M",2015, "998cc liquid-cooled, 4-stroke, DOHC,inline 4-cylinder engine featuring a crossplane crankshaft (CP4) technology"),
            new Truck ("Hyundai","Santa Cruz",2021,4)
        };

        for(Vehicle currentVehicle: vehicles){
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();
        }
    }
}    

	    