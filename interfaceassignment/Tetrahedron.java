package interfaceassignment;

public class Tetrahedron extends ThreeD{
	
	 public Tetrahedron(ShapeColor sc, double a) {
	        super(sc, a);
	    }

	    public double area() {
	        return Math.sqrt(3) * a * a;
	    }

	    public double volume() {
	        return (Math.pow(a, 3)) / (6 * Math.sqrt(2));
	    }

	    public String toString() {
	        return "Tetrahedron -> " + super.toString();
	    }
}
