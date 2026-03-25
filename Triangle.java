package InterfacePackage;

public class Triangle implements Shape {
	double breadth,height,radius;
	public void findarea(double height,double breadth,double radius) {
		this.height=height;
		this.breadth=breadth;
		this.radius=radius;
		}
	@Override
	public void findArea() {
		double area = (breadth *height)/2;
		System.out.println(area);
		}

	@Override
	public void findVolume() {
		double volume =(1.0/3) * 3.14 * radius *radius * height;
		System.out.println(volume);
	}	

}
