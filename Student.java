package studentpackage;

public class Student {
	private int id;
	private String name;
	private int internal1;
	private int internal2;
	private int internal3;
	private int finalRes;
	
	public void totalRes() {
		finalRes = internal1+internal2+internal3;
	}
	public Student() {
		id = 0;
		name =null; 
		internal1=20;
		internal2=26;
		internal3=25;
	}

public Student(int id, String name,int internal1,int internal2,int internal3) {
	this.id=id;
	this.name=name;
	this.internal1=internal1;
	this.internal2=internal2;
	this.internal3=internal3;
	
}
public Student(Student copy) {
	this.id=copy.id;
	this.name=copy.name;
	this.internal1=copy.internal1;
	this.internal2=copy.internal2;
	this.internal3=copy.internal3;
	this.finalRes=copy.finalRes;
}	
//Getting length property of the object
	public int getId() {
		return id;
	}
	// Getting bradth property of the object
	public String getName() {
		return name;
	}
	// Getting area property of the object
	public int getInternal1() {
		return internal1;
	}
	public int getInternal2() {
		return internal2;
	}
	public int getInternal3() {
		return internal3;
	}
	public int getFinalRes() {
		return finalRes;
	}
	public void setname(String name) {
		this.name=name;
	}
	//setting the breadth property of the object
	public void setinternal1(int internal1) {
		this.internal1=internal1;
	}
	public void setinternal2(int internal2) {
		this.internal2=internal2;
	}
	public void setinternal3(int internal3) {
		this.internal3=internal3;
	}
	public void printDetails() {
		System.out.println(id+" "+name+" "+internal1+" "+internal2+" "+internal3+" "+finalRes); 
	}
	public static void displayAll(Student student1,Student student2,Student student3) {
		student1.printDetails();
		student2.printDetails();
		student3.printDetails();
	}
	public static void main(String[] arg) {
		Student mithunStudent=new Student(124,"mithun",24,25,23);//creating a object and allocating memory for the properties of the object
										// assigning values to the properties by calling no aruguments constructor
		
		mithunStudent.totalRes(); //Calling Getarea method and Storing  result into result variable.
		System.out.println(mithunStudent.getFinalRes());
		
		Student maheshStudent=new Student(mithunStudent);
		System.out.println(mithunStudent.getFinalRes());
		maheshStudent.id=125;
		
		Student vijayStudent=new Student();//creating a object and allocating memory for the properties of the object
		// assigning values to the properties by calling no aruguments constructor

vijayStudent.totalRes(); //Calling Getarea method and Storing  result into result variable.
System.out.println(vijayStudent.getFinalRes());
Student.displayAll(mithunStudent, maheshStudent, vijayStudent);
	}
}

