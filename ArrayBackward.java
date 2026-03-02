package secondproject;

import java.util.Scanner;

public class ArrayBackward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sAges = new int[5];
		//datatype[] arrayname = new datatype[size];
		 
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<sAges.length;i++) {
			sAges[i]=scanner.nextInt();
			 
		}
		 
		// for(datatype variablename : arrayname){ statements }
		System.out.println("backward direction");
		for(int i=sAges.length-1; i>=0;i--)
		{
		System.out.println(sAges[i]);
		}
		System.out.println("****************");
		//enhanced for loop or read only in forward
		for(int age:sAges)
		{
		System.out.println(age);
		}
		 
		System.out.println(sAges.length);
		}
	}


