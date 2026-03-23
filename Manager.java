package studentpackage;

public class Manager extends Employeee{
	private int manId;
	 
	public Manager() {
	super();
	// TODO Auto-generated constructor stub
	}
	public Manager(int empId, String firstName, String lastName, double salary, String emailId, String mobileNo)
	{
	super(empId, firstName, lastName, salary, emailId, mobileNo);
	}
	public Manager(int empId, String firstName, String lastName, double salary, String emailId, String mobileNo,int manId) {
	this(empId, firstName, lastName, salary, emailId, mobileNo);//calls the parent class constructor
	this.manId=manId;
	// TODO Auto-generated constructor stub
	}
	@Override
	public String printDetails()
	{
	return this.empId+" "+this.firstName+" "+this.lastName+" "+this.emailId+""+this.salary+" "+this.mobileNo+" "+this.manId;
	 
	}
	 
	public void setProject()//only present in the manager
	{
	System.out.println("assigning the project to the manager");
	}
	 
	//Manager manager = new Manager(id,fir)
	}


