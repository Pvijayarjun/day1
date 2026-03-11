package assignment2;

public class AreaDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area= new Area();
		 // Rectangle area
		area.length=20;
		area.breath=5;
		int res = area.length*area.breath;
		System.out.println("Area of Rectangle: " + res);

		 // Square area
	    Area area1=new Area();
	    area1.length=20;
	    int res1 = area1.length*area1.length;
	    System.out.println("Area of Square: " + res1);
	    
	 // Circle area
	    Area area2= new Area();
	    area2.radius=5;
	    double res2= 3.14*area2.radius*area2.radius;
	    System.out.println("Area of circle: " + res2);

	}

}
