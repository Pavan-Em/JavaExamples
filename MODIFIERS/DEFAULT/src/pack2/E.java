package pack2;
import pack1.A;
public class E extends A
{
	public static void main(String[]args)
	{
		E obj1=new E();
		System.out.println(obj1.i);
		A obj2=new A();
		System.out.println(obj2.i);
	}

}

//cant use default member out side package if the class is inherited