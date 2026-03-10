package assignment2;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);

		        int[] arr = new int[5];

		        System.out.println("Enter 5 numbers:");

		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = sc.nextInt();// 2, 3, 5, 7,14
		        }

		        System.out.println("Prime numbers are:");

		        for (int i = 0; i < arr.length; i++) // i=1 1<5
		        	
		        {
		            int n = arr[i];//n=3
		            int count = 0;//2

		            for (int j = 1; j <= n; j++) // j=3 3<=3
		            {

		                if (n % j == 0) { //3%3==0
		                    count++;//2
		               }
		            }

		            if (count == 2) {
		                System.out.println(n);
		            }
		        }
		    }
		}

	