package pack1;
public class A
{
	int i=666;//default Access/scope
	//constructor default
	A(){}
	public static void main(String[]args)
	{
		A obj1=new A();
		System.out.println(obj1.i);
	}
}

//we can use default member inside class