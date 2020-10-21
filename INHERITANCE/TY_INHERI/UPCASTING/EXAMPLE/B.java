class B extends A
{
	static int c=3;
	int d=4;

	static
	{
		System.out.println("static from B");
	}

	{
		System.out.println("non static from B");
	}
}