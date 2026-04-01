package ExceptionPackage;

public class Arth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{ 
		    int x = 0; 
		    int y = 5 / x; 
		} 
		catch (ArithmeticException ae) 
		{
		    System.out.println("Exception"); 
		} 
		catch (Exception e) 
		{
		    System.out.println(" Arithmetic Exception"); 
		} 
		System.out.println("finished");

	}

}
