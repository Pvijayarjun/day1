import java.util.Scanner;

public class CircleArea 
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);// creating a object for a scanner 

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;// we can add a math as a predefined class
        System.out.println("Area of Circle = " + area);

        sc.close();
    }
}