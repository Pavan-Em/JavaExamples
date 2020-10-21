package Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class OOS {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e1 = new Employee("Pavan", 606);
		Employee e2 = new Employee("Tools", 666);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Windows\\Desktop\\IOStream\\fos.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Desktop\\IOStream\\fos.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//System.out.println(ois.readObject());
		Employee e3 =(Employee) ois.readObject();
		System.out.println(e3);
	}
}

class Employee implements Serializable
{
	transient final String name;
	transient final int id;
	transient final int i=10;
	transient final String s = "hola";
	
	public Employee(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return "["+id+","+name+","+i+","+s+"]";
	}
}
