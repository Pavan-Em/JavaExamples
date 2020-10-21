package driver;
import pack2.E;
import pack1.A;

class driver
{
	public static void main(String[]args)
	{
		E obj1=new E();//A constructor is protected but still we can create obj of E
		//System.out.println(obj1.i);//cant use 
		A obj2=new A();//constructor is protected so cant create obj A
		//System.out.println(obj2.i);
	}
}

//we cant use protected members out side package with the help of both sub and super class obj ref