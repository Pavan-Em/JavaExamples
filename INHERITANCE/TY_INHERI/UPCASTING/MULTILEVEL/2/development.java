class development extends Employee
{
	static int i=3;
	int j=99;

	static void dev()
	{
		System.out.println("static from development");
	}

	void development()
	{
		System.out.println("non static from development");
	}
}