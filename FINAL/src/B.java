class A
{
	private static void test()
	{
		System.out.println("from A");
	}
	final static void exam()
	{
		System.out.println("final from A");
	}
}

class B extends A
{
	static void test()
	{
		System.out.println("from B");
	}
	
	static void exam()
	{
		System.out.println("final from B");
	}
	
}