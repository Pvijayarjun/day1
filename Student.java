package assignment2;

import java.util.Scanner;

public class Student {
	//blue print of student //logical --no memory
	//class --- it is user defined datatype
	
	// properties
	//instance variables or object variables
	private int rollNo;
	private String name;
	private short age;
	private String mobileNo;
	 
	//behaviours or methods or functions
	public void readData()//method
	{
	Scanner sn = new Scanner(System.in);
	System.out.println("enter the rollno, name,age, mobileno");
	rollNo=sn.nextInt();
	name=sn.next();
	age = sn.nextShort();
	mobileNo = sn.next();
	}
	 
	public void displayData()
	{
	System.out.println(rollNo);
	System.out.println(name);
	System.out.println(age);
	System.out.println(mobileNo);
	}
	 
	public static void main(String[] a)
	{
	Student s = new Student();//it allocates the memory for the properties
	 
	System.out.println(s);
	System.out.println(s.rollNo);
	s.readData();
	s.displayData();
	 
	Student s1 = new Student();
	System.out.println(s1);
	s1.readData();//10f87f48.read
	s1.displayData();
	}
	}


