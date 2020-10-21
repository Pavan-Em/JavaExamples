package COMMON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class property {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream input = new FileInputStream("C:\\Users\\Windows\\Desktop\\IO\\propertyfile.txt");
		p.load(input);
		System.out.println(p);
		System.out.println(p.getProperty("Emp_ID"));
		Enumeration<String> e = (Enumeration<String>) p.propertyNames();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		p.setProperty("Emp_PhoneNo", "8105594104");
		p.setProperty("Emp_name", "Hasta El Fuego");
		p.getProperty("Emp", "Emp is not defined");
		FileOutputStream output = new FileOutputStream("C:\\Users\\Windows\\Desktop\\IO\\propertyfile.txt");
		p.store(output, "Updated Shit");
		
	}
}
