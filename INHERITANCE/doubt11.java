class A
{
	static int i=33;
	/* can't write return statement here */
	 static void test()
	{
		 return;
	}
}
class B extends A
{
	static int i=66;
	static void test()
	{
		System.out.println("hehehhhehhhe");
	}
}
class doubt11
{
	public static void main(String[]args)
	{

		B.test();
	}
}
//OUTPUT
//hehehhhehhhe