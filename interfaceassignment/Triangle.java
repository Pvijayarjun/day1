package interfaceassignment;

public class Triangle extends TwoD {
	  public Triangle(ShapeColor sc, int a, int b, int c) {
	        super(sc, a, b, c);
	    }

	    public double area() {
	        double s = (a + b + c) / 2.0;
	        return s;
	    }

	    public String toString() {
	        return "Triangle -> " + super.toString();
	    }
}
