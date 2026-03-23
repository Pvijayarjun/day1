package studentpackage;

public class Employeee {
	protected int empId;
	protected String firstName;
	protected String lastName;
	protected double salary;
	protected String emailId;
	protected String mobileNo;
	
	static int count=1;
	Employeee(){
	super();
	}
	//constructors doesnt inherit to the child class
	Employeee(int empId,String firstName,String lastName,double salary,String emailId,String mobileNo)
	{
	this.empId=empId;
	this.firstName=firstName;
	this.lastName=lastName;
	this.salary=salary;
	this.emailId=emailId;
	this.mobileNo=mobileNo;
	}
	 
	public String printDetails()
	{
	return this.empId+" "+this.firstName+" "+this.lastName+" "+this.emailId+""+this.salary+" "+this.mobileNo;
	}
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	public String getLastName() {
	return lastName;
	}
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
	public double getSalary() {
	return salary;
	}
	public void setSalary(double salary) {
	this.salary = salary;
	}
	public String getEmailId() {
	return emailId;
	}
	public void setEmailId(String emailId) {
	this.emailId = emailId;
	}
	public String getMobileNo() {
	return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
	}
	@Override
	public int hashCode()
	{
	return this.empId*(count++)+1000;//double
	}
	@Override
	public String toString()
	{
	return "Hello welcome";
	}
}