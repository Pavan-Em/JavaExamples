class A
{
	static
	{
		System.out.println("from A");
	}
}
class B extends A
{
	static
	{
		System.out.println("from B");
	}
}
class C extends A
{
	static
	{
		System.out.println("from C");
	}
}
class doubt3
{
	public static void main(String[]args)
	{
		B obj=new B();
		C obj1=new C();//here class A static initializer gets executed only once
	}
}

//impt dont forget