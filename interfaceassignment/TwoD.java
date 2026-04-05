package interfaceassignment;

public abstract class TwoD implements Shape,Colorable{
	ShapeColor sc;
    int a, b, c, d;
    public TwoD() {}

    public TwoD(ShapeColor sc, int a) {
        this.sc = sc;
        this.a = a;
    }

    public TwoD(ShapeColor sc, int a, int b) {
        this.sc = sc;
        this.a = a;
        this.b = b;
    }

    public TwoD(ShapeColor sc, int a, int b, int c) {
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TwoD(ShapeColor sc, int a, int b, int c, int d) {
        this.sc = sc;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void recolor(ShapeColor sc) {
        this.sc = sc;
    }

    public ShapeColor getColor() {
        return sc;
    }

    public String toString() {
        return "Color: " + sc;
    }
}

