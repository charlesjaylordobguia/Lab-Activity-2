

public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle("Toyata", "Vios", 2020);
		Vehicle vehicle2 = new Vehicle("Honda", "Civic", 1995);
	    Vehicle vehicle3 = new Vehicle("Mitsubishi", "Lancer", 2010);
	    
	        System.out.println("Vehicle 1");
	        vehicle1.displayInfo();         
	        System.out.println("Age: " + vehicle1.calculateAge() + "\n" + "Vintage: " + vehicle1.isVintage());
	        
	        System.out.println();
	        
                System.out.println("Vehicle 2");
                vehicle2.displayInfo();
	        System.out.println("Age: " + vehicle2.calculateAge() + "\n " + "Vintage: " + vehicle2.isVintage());

	        System.out.println();

	        System.out.println("Vehicle 3");
	        vehicle3.displayInfo();
	        System.out.println("Age: " + vehicle3.calculateAge() + "\n" + "Vintage: " + vehicle3.isVintage());

	}

}
