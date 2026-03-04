package loops;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;

        for(int i = 1; i <= size; i++) {

            // spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j1 = i; j1 <= size; j1++) {
                System.out.print("* ");
            }

            System.out.println();
        }

	}

}
