package InterfacePackage;

public class Rectangle implements Shape {
	double length,height,breadth;
	
	public void findarea(double length,double breadth,double height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		}

	
	
	@Override
	
	public void findArea() {
		double area = length*breadth;
		System.out.println(area);
	}
	
	
	
	@Override
	public void findVolume() {
		System.out.println (length*breadth*height);
		}

}
