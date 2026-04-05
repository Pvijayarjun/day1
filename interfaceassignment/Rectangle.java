package interfaceassignment;

public class Rectangle extends TwoD {
	 public Rectangle(ShapeColor sc, int l, int w) {
	        super(sc, l, w);
	    }

	    public double area() {
	        return a * b;
	    }

	    public String toString() {
	        return "Rectangle -> " + super.toString();
	    }
}
