package InterfacePackage;

public class Vehicle {
	String brand ;
	int speed;
	Vehicle(){
		
	}
	
	Vehicle (String brand,int speed){
		this.brand=brand;
		this.speed=speed;
		
	}
	
	void displayDetails() {
		System.out.println(brand);
		System.out.println(speed);
	}
	
}
