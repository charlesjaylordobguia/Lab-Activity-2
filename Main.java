public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle("Toyota", "Vios", 2020);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle vehicle3 = new Vehicle("Mitsubishi", "Lancer", 2010);


	    vehicle1.displayInfo();
        System.out.println("get brand: " + vehicle1.getBrand());
        System.out.println("get model: " + vehicle1.getModel());
        System.out.println("get year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        
        vehicle2.displayInfo();
        System.out.println("get brand: " + vehicle2.getBrand());
        System.out.println("get model: " + vehicle2.getModel());
        System.out.println("get year: " + vehicle2.getYear());
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        
        vehicle3.displayInfo();
        System.out.println("get brand: " + vehicle3.getBrand());
        System.out.println("get model: " + vehicle3.getModel());
        System.out.println("get year: " + vehicle3.getYear());
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
	    


        
    }

}