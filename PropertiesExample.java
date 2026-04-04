package sortingPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr =new Properties();
		FileInputStream fis = new FileInputStream("database.properties");
		pr.load(fis);
		

	}

}
