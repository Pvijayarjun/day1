package studentpackage;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee emp = new Employeee();
		System.out.println(emp.hashCode()); //shape --findArea() rectangle --findArea
		//Object ---hashCode Employee
		System.out.println(emp);
		System.out.println("object string "+emp);
		System.out.println(emp.printDetails());
		//baseclass reference variable can store the child class object
		emp = new Manager(200,"abhi","singh",67897.87,"a@gmail.com","9876567563",1234);
		System.out.println(emp.printDetails());
		Manager manager =(Manager) emp;//typecasting emp from employee to manager
		manager.setProject();
		System.out.println(emp.hashCode());
		//println(referencevariable)//toString
		}
		 
		
	}


