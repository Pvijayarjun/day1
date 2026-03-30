package InterfacePackage;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car = new Car();
        Vehicle bike = new Bike();
        
        
        
        System.out.println("Car Details:");
        ((Car) car).carDetails();
       

        System.out.println("\nBike Details:");
        ((Bike) bike).bikeDetails();

	}

}
