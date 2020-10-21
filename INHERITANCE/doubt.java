class A
{
	static int a=3;
	{
		System.out.println("A");
	}
}
class B extends A
{
	static int b=6;
	{
		System.out.println("B");
	}
}
class doubt
{
	public static void main(String[]args)
	{
		B obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}