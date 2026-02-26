import java.util.Scanner;

public class UserDetails 
{
    public static void main(String[] args) 
{

        Scanner sc = new Scanner(System.in);

        // Taking name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Printing output
        System.out.println("My name is " + name + " and I am " + age + " years old");

        sc.close();
    }
}