package studentpackage;

public class Temperature {
	 private int temp;

	    public void setTemp(int t) {

	        if (t >= -50 && t <= 50) {
	            temp = t;
	        } else {
	            System.out.println("Invalid temperature");
	        }
	    }

	    public int getTemp() {
	        return temp;
	    }
	
	    public static void main(String[] args) {

	        Temperature t = new Temperature();

	        t.setTemp(25);
	        System.out.println(t.getTemp());

	        t.setTemp(100); // invalid
	    }
}
