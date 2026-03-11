package assignment2;

public class cardetails {
	public static void main(String[] a) {
  car c=new car();//calling Class
  c.companyname="tata";
  c.carName="Nexon";
  c.Capacity="6seater";
  c.fueltype="petrol";
  c.modelyear=2022;
  
  System.out.println(c.companyname);
  System.out.println(c.carName);
  System.out.println(c.Capacity);
  System.out.println(c.fueltype);
  System.out.println(c.modelyear);

  
}
}