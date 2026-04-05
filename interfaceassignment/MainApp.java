package interfaceassignment;

import java.util.Scanner;

public class MainApp {
	
	    static Scanner sc = new Scanner(System.in);

	    public static ShapeColor getColor() {
	        System.out.println("Choose Color: 1.BLUE 2.YELLOW 3.RED 4.GREEN 5.WHITE");
	        int ch = sc.nextInt();
	        return ShapeColor.values()[ch - 1];
	    }

	    public static void main(String[] args) {

	        System.out.println("Choose Shape:");
	        System.out.println("1.Circle 2.Rectangle 3.Triangle 4.Trapezoid");
	        System.out.println("5.Sphere 6.Cube 7.Tetrahedron");

	        int choice = sc.nextInt();
	        ShapeColor color = getColor();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter radius: ");
	                Circle c = new Circle(color, sc.nextInt());
	                System.out.println(c);
	                System.out.println("Area: " + c.area());
	                break;

	            case 2:
	                System.out.print("Enter length and width: ");
	                Rectangle r = new Rectangle(color, sc.nextInt(), sc.nextInt());
	                System.out.println(r);
	                System.out.println("Area: " + r.area());
	                break;

	            case 3:
	                System.out.print("Enter 3 sides: ");
	                Triangle t = new Triangle(color, sc.nextInt(), sc.nextInt(), sc.nextInt());
	                System.out.println(t);
	                System.out.println("Area: " + t.area());
	                break;

	            case 4:
	                System.out.print("Enter a b c d h: ");
	                Trapezoid tr = new Trapezoid(color,
	                        sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
	                System.out.println(tr);
	                System.out.println("Area: " + tr.area());
	                break;

	            case 5:
	                System.out.print("Enter radius: ");
	                Sphere s = new Sphere(color, sc.nextDouble());
	                System.out.println(s);
	                System.out.println("Area: " + s.area());
	                System.out.println("Volume: " + s.volume());
	                break;

	            case 6:
	                System.out.print("Enter side: ");
	                Cube cu = new Cube(color, sc.nextDouble());
	                System.out.println(cu);
	                System.out.println("Area: " + cu.area());
	                System.out.println("Volume: " + cu.volume());
	                break;

	            case 7:
	                System.out.print("Enter side: ");
	                Tetrahedron te = new Tetrahedron(color, sc.nextDouble());
	                System.out.println(te);
	                System.out.println("Area: " + te.area());
	                System.out.println("Volume: " + te.volume());
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }
	    }

	}

