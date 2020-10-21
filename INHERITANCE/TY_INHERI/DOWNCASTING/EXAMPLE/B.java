class B extends A
{
	static int b=2;
	int j=66;

	void fromb()
	{
		System.out.println("non static from B");
	}

	static void testb()
	{
		System.out.println("static from B");
	}
}