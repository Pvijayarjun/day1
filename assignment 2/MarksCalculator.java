import java.util.Scanner;

public class MarksCalculator
 {
    public static void main(String[] args) 
{

        Scanner sc = new Scanner(System.in);

        // Taking marks of 3 subjects
        System.out.print("Enter marks of Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double m3 = sc.nextDouble();

        // Calculating total
        double total = m1 + m2 + m3;

        // Calculating average
        double average = total / 3;

        // Printing results
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}