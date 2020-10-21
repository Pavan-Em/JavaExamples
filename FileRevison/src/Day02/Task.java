package Day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Task {

	public static void main(String[] args) throws Exception {
		
		animal obj = new animal("Kithodonu");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Windows\\Desktop\\StreamTesting.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(obj);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Desktop\\StreamTesting.txt");
		ObjectInputStream is = new ObjectInputStream(fis);
		
		animal dog1 = (animal)is.readObject();
		
		//System.out.println(dog1);
		System.out.println(dog1.name);
		System.out.println(dog1.name2);
	}
}

class dog 
{
	String name = "lowda";
	public dog() {}
	public dog (String name )
	{
		this.name = name;
	}
	
	
}

class animal extends dog implements Serializable
{
	String name2="Bvc0";
	public animal(String name)
	{
		super(name);
	}
}
