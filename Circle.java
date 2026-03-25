package InterfacePackage;

public class Circle implements Shape{
	double r;
	public void findarea(double r) {
		this.r=r;
	}
		
	@Override
	public void findArea() {
		double area = Math.PI*r*r;
		System.out.println(area);
		}

	@Override
	public void findVolume() {
		double volume=Math.PI*(4/3)*r*r*r;
		System.out.println(volume);
	 }
	

}
