package studentpackage;

public class Person {
	 Person() {
	        System.out.println("Default constructor");
	    }

	    Person(String name) {
	        System.out.println("Name: " + name);
	    }

	    Person(String name, int age) {
	        System.out.println(name + " " + age);
	    }
	
	    public static void main(String[] args) {

	        Person p1 = new Person();
	        Person p2 = new Person("Arjun");
	        Person p3 = new Person("Arjun", 22);
	    }
}
