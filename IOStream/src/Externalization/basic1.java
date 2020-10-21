package Externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class basic1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1 = new Employee(606, "Pavan", "pavan@666");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Windows\\Desktop\\IOStream\\Externalization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Desktop\\IOStream\\Externalization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee)ois.readObject();
		
		System.out.println(e2.id+"      "+e2.name+"   "+e2.pwd);
	}
}


class Employee implements Externalizable
{
	transient String name ;
	int id;
	String pwd;
	
	public Employee() {}
	public Employee(int id ,String name ,String pwd)
	{
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}
	
	public String toString()
	{
		return "["+id+","+name+","+pwd+"]";
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		int eid = 23+id;
		System.out.println(eid);
		out.writeInt(eid);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name=(String)in.readObject();
		
		id=in.readInt()-23;
	}
	
	
}
