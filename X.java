package ExceptionPackage;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try 
	        {
	            badMethod();  
	            System.out.print("A"); 
	        }  
	        catch (Error ex) //Error()
	        {
	            System.out.print("B");  
	        } 
	        finally 
	        {
	            System.out.print("C"); 
	        } 
	        System.out.print("D"); 
	    }  
	    public static void badMethod() 
	    {
	        throw new Error(); /* Line 22 */
	    } 

	}


