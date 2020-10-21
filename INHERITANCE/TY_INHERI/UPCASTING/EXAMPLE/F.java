class F extends C
{
	static int k=11;
	int l=12;

	static
	{
		System.out.println("static from F");
	}

	{
		System.out.println("non static from F");
	}
}