package loops;

public class Fullpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int size = 5;

	        // Pyramid
	        for(int i = 1; i <= size; i++) {

	            for(int j = 1; j <= size - i; j++) {
	                System.out.print(" ");
	            }

	            for(int j1 = 1; j1 <= i; j1++) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }

	        // Reverse Pyramid
	        for(int i = 1; i <= size; i++) {

	            for(int j = 1; j < i; j++) {
	                System.out.print(" ");
	            }

	            for(int j1 = i; j1 <= size; j1++) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	}

}
