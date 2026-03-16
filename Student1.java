package studentpackage;

public class Student1 {
	 // private variables (cannot access directly)
    private int id;
    private String name;

    // setter for id
    public void setId(int id) {
        this.id = id;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for id
    public int getId() {
        return id;
    }

    // getter for name
    public String getName() {
        return name;
    }



    public static void main(String[] args) {

        Student1 s = new Student1();

        // setting values using setter
        s.setId(101);
        s.setName("Arjun");

        // printing using getter
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
