package loops;

public class ReverseStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 5; i >= 1; i--) {     // rows

            for(int j = 1; j <= i; j++) { // stars
                System.out.print("*");
            }

            System.out.println();        // next line
        }
    }

	}


