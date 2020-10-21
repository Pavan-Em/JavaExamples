class D extends B
{
	static int g=7;
	int h=8;

	static
	{
		System.out.println("static from D");
	}

	{
		System.out.println("non static from D");
	}
}