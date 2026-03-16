package studentpackage;

public class Car {
	 String brand;
	    int price;

	    // constructor
	    Car(String b, int p) {
	        brand = b;
	        price = p;
	    }
	
	    public static void main(String[] args) {

	        Car c = new Car("BMW", 5000000);

	        System.out.println(c.brand);
	        System.out.println(c.price);
	    }

}
