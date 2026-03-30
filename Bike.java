package InterfacePackage;

public class Bike extends Vehicle{
	private boolean hasGear;
	
	 public boolean getHasGear() {
		return hasGear;
	}

	public void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}

	// Constructor
	Bike(){
		
	}
	
    Bike(String brand, int speed,boolean hasGear ) {
        super(brand, speed);
        this.hasGear=hasGear;
    }
        
        void bikeDetails() {
            super.displayDetails();
            System.out.println("Has Gear: "+ hasGear);
}

}
