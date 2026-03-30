package InterfacePackage;

public class Car extends Vehicle{
	  private  String fuelType;
	  

	    public String getFuelType() {
		return fuelType;
	}
	  public void setFuelType(String fuelType) {
		  this.fuelType = fuelType;
	  }
	  // Constructor
	  Car(){
	  
	  }
	    Car(String brand, int speed, String fuelType) {
	        super(brand, speed);
	        this.fuelType = fuelType;
	    }
	        
	       void carDetails() {
	            super.displayDetails();
	            System.out.println("Fuel Type: " + fuelType);
}
}