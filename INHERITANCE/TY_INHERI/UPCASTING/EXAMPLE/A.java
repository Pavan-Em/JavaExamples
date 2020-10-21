class A
{
	static int a=1;
	int b=2;

	static
	{
		System.out.println("static from A");
	}

	{
		System.out.println("non static from A");
	}

}