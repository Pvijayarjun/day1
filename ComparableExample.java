package sortingPackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
	List<Student> studentList=new LinkedList<Student>();
	studentList.add(new Student(100,"mahesh",23.23f,6));
	studentList.add(new Student(200,"mithun",21.23f,6));
	studentList.add(new Student(300,"darshan",26.23f,6));
	studentList.add(new Student(400,"vijay",24.23f,6));
	studentList.add(new Student(500,"manju",22.23f,6));
	
	System.out.println(studentList);
	Collections.sort(studentList);
	System.out.println(studentList);
	 
	Collections.sort(studentList, new SemesterComperator());
	System.out.println("sorting based on the semester");
	System.out.println(studentList);
	
	Collections.sort(studentList, new NameComperator());
	System.out.println("sorting based on the name");
	System.out.println(studentList);
}

}