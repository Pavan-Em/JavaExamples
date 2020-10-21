class A
{
	static int a=3;
	static
	{
		System.out.println("A");
	}
}
class B extends A
{
	static int b=6;
	static
	{
		System.out.println("B");
	}
}
class doubt10
{
	public static void main(String[]args)
	{
		System.out.println(B.b);
	}
}
//OUTPUT
//A
//B
//6