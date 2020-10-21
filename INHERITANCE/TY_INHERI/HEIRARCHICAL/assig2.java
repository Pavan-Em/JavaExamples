class A
{
	int i=10;
	{
		System.out.println("from class A IIB-1");
	}
	A()
	{
		this(10);
		System.out.println("from class A(int)");
	}
	A(int i)
	{
		System.out.println("from class A(int)");
	}
}
class B extends A
{
	{
		System.out.println("from class B IIB-1");
	}
	int j=20;
	B()
	{
		super(10);
		System.out.println("from B()");
	}
	B(int i)
	{
		this();
		System.out.println("from class B()");
	}
}
class assig2
{
	public static void main(String[]args)
	{
		B obj1=new B();
		System.out.println("=================================");
		B obj2= new B(20);
	}
}