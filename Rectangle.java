package studentpackage;

public class Rectangle {
	 int length;
	    int width;

	    // parameterized constructor
	    Rectangle(int l, int w) {
	        length = l;
	        width = w;
	    }

	    void area() {
	        System.out.println(length * width);
	    }
	
	    public static void main(String[] args) {

	        Rectangle r = new Rectangle(5, 4);

	        r.area();
	    }
}
