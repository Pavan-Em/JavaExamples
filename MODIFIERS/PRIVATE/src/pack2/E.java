package pack2;
import pack1.A;

class E extends A
{
	public static void main(String[]args)
	{
		E obj1=new E();
		System.out.println(obj1.i);
		A obj2=new A();
		System.out.println(obj2.i);
	}
}

//cant use private members out side packgae even class is inherited