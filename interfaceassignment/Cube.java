package interfaceassignment;

public class Cube extends ThreeD{
	 public Cube(ShapeColor sc, double side) {
	        super(sc, side);
	    }

	    public double area() {
	        return 6 * a * a;
	    }

	    public double volume() {
	        return a * a * a;
	    }

	    public String toString() {
	        return "Cube -> " + super.toString();
	    }
	
}
