import java.util.Scanner;
class Salary
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the salary=");
	 double salary = sc.nextDouble();
	String sal = salary>50000 ? "higher salary" : " Average Salary";
	 System.out.println(sal);
	sc.close();
	}
}