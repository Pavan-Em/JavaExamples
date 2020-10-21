package pack1;

class C extends A
{
	public static void main(String[]args)
	{
		C obj1=new C();
		System.out.println("this is by using sub class ref "+obj1.i);
		A obj2=new A();
		System.out.println("this is by using super class ref "+obj2.i);
	}
}

//we can use default member in sub class same package