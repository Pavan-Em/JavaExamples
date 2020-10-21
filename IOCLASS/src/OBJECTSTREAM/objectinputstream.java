package OBJECTSTREAM;
import java.io.*;
public class objectinputstream {
	public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Windows\\Desktop\\IO\\inputobject.txt");
		System.out.println(fis.read());
		ObjectInputStream ois=new ObjectInputStream(fis);
		System.out.println(ois.available());
		emp e1=(emp)ois.readObject();//it  throws classnotfount Exception
		emp e2=(emp)ois.readObject();
		emp e3=(emp)ois.readObject();
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e2.name);
		System.out.println(e2.id);
		e1.display();
		
	char[] n=System.lineSeparator().toCharArray();
	System.out.println((int)(n[0]));
	
	String s=System.lineSeparator();
	for(char c:s.toCharArray())
	{
		System.out.println((int)c);
	}
		
	}
}
