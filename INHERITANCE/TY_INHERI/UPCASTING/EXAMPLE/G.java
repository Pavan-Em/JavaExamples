class G extends C
{
	static int m=13;
	int n=14;

	static
	{
		System.out.println("static from G");
	}

	{
		System.out.println("non static from G");
	}
}