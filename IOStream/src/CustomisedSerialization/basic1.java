package CustomisedSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class basic1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1 = new Employee(606, "Pavan", "pavan006@");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Windows\\Desktop\\IOStream\\CustomizedSerialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Desktop\\IOStream\\CustomizedSerialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee)ois.readObject();
		
		System.out.println(e2);
	}
}

class Employee implements Serializable
{
	transient int id ;
	String name;
	transient String pwd;
	
	public  Employee (int id , String name ,String pwd)
	{
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public String toString()
	{
		return "["+id+","+name+","+pwd+"]";
	}
	
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		Random r = new Random();
		oos.defaultWriteObject();
		String epwd = "as"+pwd.substring(0,2)+r.nextInt(10)+r.nextInt(10)+pwd.substring(2,6)+"@&"+pwd.substring(6);
		oos.writeObject(epwd);
		int eid = 6666+id;
		oos.writeInt(eid);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject();
		String epwd = (String)ois.readObject();
		pwd=epwd.substring(2,4)+epwd.substring(6,10)+epwd.substring(12);
		int eid = ois.readInt()-6666;
		id=eid;
	}
}
