package Day02;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalize {

	public static void main(String[] args) throws Exception {
		
		employee02 obj01 = new employee02(1,"pavan","Tools");
		employee02 obj02 = new employee02(2,"Rathna","Kera");
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\Windows\\Desktop\\StreamTesting.txt");
		ObjectOutputStream fout = new ObjectOutputStream(out);
		fout.writeObject(obj01);
		fout.writeObject(obj02);
		fout.flush();
		
		FileInputStream in = new FileInputStream("C:\\Users\\Windows\\Desktop\\StreamTesting.txt");
		ObjectInputStream fin = new ObjectInputStream(in);
		employee02 o1 =(employee02)fin.readObject();
		employee02 o2 =(employee02)fin.readObject();
		
		System.out.println(o1.id);
		System.out.println(o1.name);
		System.out.println(o1.pwd);
		
		System.out.println(o2.id);
		System.out.println(o2.name);
		System.out.println(o2.pwd);
	}
	
}

class employee02 implements Externalizable
{
	int id;
	String name ;
	String pwd= "Lowda";
	
	public employee02() {}
	
	public employee02(int id , String name , String pwd)
	{
		this.id = id ;
		this.name =name ;
		this.pwd = pwd;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		id = in.readInt();
		
	}
}
