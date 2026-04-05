package interfaceassignment;

public class Circle extends TwoD {
	 public Circle(ShapeColor sc, int r) {
	        super(sc, r);
	    }

	    public double area() {
	        return Math.PI * a * a;
	    }

	    public String toString() {
	        return "Circle -> " + super.toString() + ", Radius: " + a;
	    }
}
