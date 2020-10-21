//creating immutable class
package RANDOM;
import java.util.Scanner;
public final class r7 {
	private int i;//private is mandatory
	
	r7(int i)
	{
		this.i=i;
	}
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		r7 obj1=new r7(10);
		r7 obj2=obj1.modifyi(100);
		r7 obj3=obj1.modifyi(10);
		obj3=obj3.modifyi(30);
		System.out.println("obj1.i:"+obj1.i);
		System.out.println(obj1==obj2);
		System.out.println(obj1==obj3);
	}
	
	public r7 modifyi(int i)
	{
		if(this.i==i)
			return this;
		else
			return new r7(i);
	}
}
