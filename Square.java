package InterfacePackage;

public class Square implements Shape{
	double side;
	
	public void findarea(double side) {
		this.side=side;
		
		}
	
	@Override
	public void findArea() {
		double area = side *side;
		System.out.println(area);
	}

	@Override
	public void findVolume() {
		System.out.println(side*side*side);
	}

}
