package interfaceassignment;

public class Sphere extends ThreeD {

    public Sphere(ShapeColor sc, double r) {
        super(sc, r);
    }

    public double area() {
        return 4 * Math.PI * a * a;
    }

    public double volume() {
        return (4.0 / 3) * Math.PI * a * a * a;
    }

    public String toString() {
        return "Sphere -> " + super.toString();
    }
}
