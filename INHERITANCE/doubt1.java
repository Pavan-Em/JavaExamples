class A
{
	static int i=10;
}
class B extends A
{
	
	public static void main(String[]args)
	{
		i=20;
	}
}
class doubt1
{
	public static void main(String[]args)
	{
		System.out.println(B.i);
	}
}

//OUTPUT
//10