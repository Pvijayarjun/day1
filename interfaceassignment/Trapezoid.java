package interfaceassignment;

public class Trapezoid extends TwoD {
	 private int h;

	    public Trapezoid(ShapeColor sc, int a, int b, int c, int d, int h) {
	        super(sc, a, b, c, d);
	        this.h = h;
	    }

	    public double area() {
	        return ((a + b) / 2.0) * h;
	    }

	    public String toString() {
	        return "Trapezoid -> " + super.toString();
	    }
}
