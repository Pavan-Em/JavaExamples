package driver;

import pack1.A;
import pack2.E;

class driver
{
	public static void main(String[]args)
	{
		A obj3=new A();//cant access constructor A() also bcoz its default member
		E obj2=new E();
		System.out.println(obj2.i);
		A obj1=new A();
		System.out.println(obj1.i);
	}
}