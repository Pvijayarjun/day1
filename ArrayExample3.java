package secondproject;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sAges = new int[5];
		//datatype[] arrayname = new datatype[size];
		 
		Scanner scanner = new Scanner(System.in);
		/*
		* sAges[0]=scanner.nextInt(); sAges[1]=scanner.nextInt();
		* sAges[2]=scanner.nextInt(); sAges[3]=scanner.nextInt();
		* sAges[4]=scanner.nextInt();
		*/
		for(int i=0; i<sAges.length;i++) {
			sAges[i]=scanner.nextInt();
			System.out.println(sAges[i]);
			}
			System.out.println(sAges.length);

	}

}
