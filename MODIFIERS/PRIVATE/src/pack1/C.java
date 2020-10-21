package pack1;
class C extends A
{
	public static void main(String[]args)
	{
		C obj1=new C();
		System.out.println(obj1.i);
		A obj2=new A();
		System.out.println(obj2.i);
	}
}

//cant use private members out side class even the class is inherited