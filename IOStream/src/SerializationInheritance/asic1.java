package SerializationInheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class asic1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TestEngg t1 = new TestEngg();
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Windows\\Desktop\\IOStream\\CustomizedSerialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Desktop\\IOStream\\CustomizedSerialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TestEngg t2 =(TestEngg)ois.readObject();
		System.out.println(t2.JD+"     "+t2.name);
	}
}

class Employee implements Serializable
{
	String name = "Pavan";
	/*public Employee(String name)
	{
		this.name = name;
	}*/
}

class TestEngg extends Employee 
{
	String JD = "TESTENGG";
	
	/*public TestEngg(String name)
	{
		super(name);
	}*/
}
