class A
{
	static int i=10;
}
class B extends A
{
	static int i=20;
}
class doubt2
{
	public static void main(String[]args)
	{
		System.out.println(B.i);
	}
}

//OUTPUT
//20