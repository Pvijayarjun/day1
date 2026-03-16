package studentpackage;

public class Company {
	private String companyName;

    // constructor
    Company(String name) {
        companyName = name;
    }

    // only getter
    public String getCompanyName() {
        return companyName;
    }

    public static void main(String[] args) {

        Company c = new Company("TCS");

        System.out.println(c.getCompanyName());
    }
}
