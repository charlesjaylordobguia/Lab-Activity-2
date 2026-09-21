package designaclass_charles;

public class Main {

	public static void main(String[] args) {
		
		 Vehicle vehicle1 = new Vehicle();
	        vehicle1.brand = "Toyota";
	        vehicle1.model = "Vios";
	        vehicle1.year = 2020;

	        Vehicle vehicle2 = new Vehicle();
	        vehicle2.brand = "Honda";
	        vehicle2.model = "Civic";
	        vehicle2.year = 1995;

	        Vehicle vehicle3 = new Vehicle();
	        vehicle3.brand = "Mitsubishi";
	        vehicle3.model = "Lancer";
	        vehicle3.year = 2010;

	        System.out.println("Vehicle 1");
	        vehicle1.displayInfo();
	        System.out.println("Age: " + vehicle1.calculateAge() + "Vintage: " + vehicle1.isVintage());
	        
	        System.out.println();
	        
	        System.out.println("Vehicle 2");
	        vehicle2.displayInfo();
	        System.out.println("Age: " + vehicle1.calculateAge() + "Vintage: " + vehicle1.isVintage());

	        System.out.println();

	        System.out.println("Vehicle 3");
	        vehicle3.displayInfo();
	        System.out.println("Age: " + vehicle1.calculateAge() + "Vintage: " + vehicle1.isVintage());

	}

}
