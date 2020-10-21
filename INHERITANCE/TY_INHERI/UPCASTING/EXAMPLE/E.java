class E extends B
{
	static int i=9;
	int j=10;

	static
	{
		System.out.println("static from E");
	}

	{
		System.out.println("non static from E");
	}
}