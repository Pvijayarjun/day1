package assignment2;

import java.util.Scanner;

public class VowConsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter your name:");
		        String name = sc.nextLine();

		        int vowels = 0;
		        int consonants = 0;

		        for (int i = 0; i < name.length(); i++) {

		            char ch = name.charAt(i);

		            if (ch == 'a' || ch == 'e' || ch == 'i' ||
		                ch == 'o' || ch == 'u' ||
		                ch == 'A' || ch == 'E' || ch == 'I' ||
		                ch == 'O' || ch == 'U') {

		                vowels++;
		            }
		            else if (ch >= 'a' && ch <= 'z' ||
		                     ch >= 'A' && ch <= 'Z') {

		                consonants++;
		            }
		        }

		        System.out.println("Vowels = " + vowels);
		        System.out.println("Consonants = " + consonants);
		    }
		

	}


