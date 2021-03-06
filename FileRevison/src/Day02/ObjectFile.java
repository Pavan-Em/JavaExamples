package Day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectFile {

	public static void main(String[] args) throws Exception {
		Obj obj1 = new Obj("Pavan",420,"B");
		Obj obj2 = new Obj("Tools",840,"A");
		FileOutputStream out = new FileOutputStream("C:\\Users\\Windows\\Desktop\\StreamTesting.txt");
		ObjectOutputStream fout = new ObjectOutputStream(out);
		fout.writeObject(obj1);
		fout.writeObject(obj2);
		fout.flush();
		
		FileInputStream in = new FileInputStream("C:\\Users\\Windows\\Desktop\\StreamTesting.txt");
		ObjectInputStream fin = new ObjectInputStream(in);
		System.out.println(in.available());
		byte[] b = new byte[in.available()];
		Obj o1 =(Obj)fin.readObject();
		Obj o2=(Obj)fin.readObject();
		//Obj o3=(Obj)fin.readObject();
		
		
		System.out.println(o1.name);
		System.out.println(o1.num);
		System.out.println(o1.grp);
		System.out.println(o2.name);
		System.out.println(o2.num);
		System.out.println(o2.grp);
		
	}
}

class Obj implements Serializable
{
	
	String name ="Pavan";
	int num = 420;
	transient final String grp;
	//public Obj () {this.grp="A";}   Nothing Happens
	public Obj (String name , int num , String grp) {
		this.name = name ;
		this.num = num;
		this.grp = grp;
	}
	
	/*public void toString
	{
		
	}*/
}
