package assignment2;

import java.util.Scanner;

public class Smallest3 { // find smallest number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        int[] arr = new int[5];

		        System.out.println("Enter 5 numbers:");

		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = sc.nextInt();
		        }

		      
		        for (int i = 0; i < arr.length - 1; i++) {
		            for (int j = i + 1; j < arr.length; j++) {

		                if (arr[i] > arr[j]) {
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }

		            }
		        }

		        System.out.println("3rd smallest element = " + arr[2]);
		    }
		}

	
