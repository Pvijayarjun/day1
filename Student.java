package sortingPackage;

public class Student implements Comparable<Student>{
	//instance variable
	private int rollNo;
	private String name;
	private float marks;
	private int sem;
	public Student() {
		super();
	}
	public Student(int rollNo, String name, float marks, int sem) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.sem = sem;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public float getMarks() {
		return marks;
	}
	public int getSem() {
		return sem;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", sem=" + sem + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.getMarks()>o.getMarks()) {
		return 1;
	}
		else if(this.getMarks()<o.getMarks()) {
		return -1;
	}else
		return 0;
	

	}
}
