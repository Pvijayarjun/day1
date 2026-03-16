package studentpackage;

public class Employee {
	 private double salary;

	    // setter with validation
	    public void setSalary(double salary) {

	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Invalid Salary");
	        }
	    }

	    // getter
	    public double getSalary() {
	        return salary;
	    }

	    public static void main(String[] args) {

	        Employee e = new Employee();

	        e.setSalary(5000);   // valid
	        System.out.println(e.getSalary());

	        e.setSalary(-100);   // invalid
	    }
}
