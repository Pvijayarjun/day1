package firstpackage;
import secondpackage.Employee;
import secondpackage.nestedpackage.Department;
class Demo
{
public static void main(String[] a)
{
System.out.println("welcome");
Student.displayMessage();
Employee.getEmpDetails();
String dept = Department.getDept();
System.out.println(dept);
}
}