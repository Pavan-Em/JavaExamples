class B extends A
{
	int a=333;
	static int b=444;

	static void test()
	{
		System.out.println("static from B");
	}

	void exam()
	{
		System.out.println("non static from B");
	}
}