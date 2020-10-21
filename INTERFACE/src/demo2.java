interface i8
{
	static int i=10;
	void test();

	static void exam()
	{
		System.out.println("from i8");
	}
}

interface i9
{
	static int i=20;
}

interface i10 extends i8,i9
{
   static int i=30;
}

class demo2
{
	public static void main(String[]args)
	{
		i8.exam();

		System.out.println(i10.i);
	}
}