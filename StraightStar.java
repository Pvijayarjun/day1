package loops;

public class StraightStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {        // rows

            for(int j = 1; j <= i; j++) {    // stars
                System.out.print("*");
            }

            System.out.println();            // move to next line
        }

	}

}
