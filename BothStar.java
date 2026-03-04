package loops;

public class BothStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		    // Increasing pattern
		    for(int i = 1; i <= 5; i++) {
		        for(int j = 1; j <= i; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }

		    // Decreasing pattern
		    for(int i = 5; i >= 1; i--) {
		        for(int j = 1; j <= i; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    	}
	}
	}


