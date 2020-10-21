package OBJECTSTREAM;
import java.io.*;
public class tryobjectagain {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\Windows\\Desktop\\IO\\inputobject.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		emp e1=(emp)ois.readObject();
		System.out.println(e1.name);
		System.out.println(e1.id);
		
	}
}
