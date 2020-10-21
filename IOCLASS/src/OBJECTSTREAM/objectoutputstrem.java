package OBJECTSTREAM;
import java.io.*;
public class objectoutputstrem {
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		emp e1=new emp("pavan",1);
		emp e2=new emp("kera",2);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Windows\\Desktop\\IO\\inputobject.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("Im Done Here");
	}
}

class emp implements Serializable
{
	int id;
	String name;
	
	public emp(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public void display()
	{
		System.out.println("ID  :"+id);
		System.out.println("Name:"+name);
	}
	
	public String toString()
	{
		return "["+id+","+name+"]";
	}
}
