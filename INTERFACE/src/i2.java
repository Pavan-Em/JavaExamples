interface i2
{
	public static void main(String[]args)
	{
		System.out.println("from main");
		test();
	}
	static void test()
	{
		System.out.println("from static");
	}
}