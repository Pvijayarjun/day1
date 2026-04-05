package interfaceassignment;

public abstract class ThreeD implements Shape, Resizable {
	  ShapeColor sc;
	  double a;

	    public ThreeD() {}

	    public ThreeD(ShapeColor sc, double a) {
	        this.sc = sc;
	        this.a = a;
	    }

	    public double getA() {
	        return a;
	    }

	    public void set(ShapeColor sc, double a) {
	        this.sc = sc;
	        this.a = a;
	    }

	    public void resize(double percentage) {
	        a = a + a * percentage / 100;
	    }

	    public abstract double volume();

	    public String toString() {
	        return "Color: " + sc + ", Value: " + a;
	    }
}
