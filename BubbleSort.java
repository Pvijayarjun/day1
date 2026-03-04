package loops;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 =new int[6];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 6 numbers ");
		 
		for(int n=0;n<arr1.length;n++)
		{
		arr1[n] = scanner.nextInt();
		 
		}
		 
		System.out.println("Given numbers : ");
		 
		for(int num : arr1)
		{
		System.out.print(num+" ");
		}
		for(int i=0;i<arr1.length-1;i++)//i=0 0<5
		{
		for(int j=0; j<arr1.length-1-i;j++)//j=3 3<6-1-0 3<5
		{
		if(arr1[j]>arr1[j+1])//34>22
		{
		int temp = arr1[j];//temp = 34
		arr1[j]= arr1[j+1];// 34= 22
		arr1[j+1]=temp;//22=34
		//2 12 34 22 15 10
		//2 12 22 34 15 10
		}
		}
		}
		System.out.println("elements after swapping");
		 
		for(int n : arr1)
		{
		System.out.println(n);
		}

	}

}
