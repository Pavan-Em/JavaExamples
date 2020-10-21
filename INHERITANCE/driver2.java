class A
{
	static int i=10;
}

class driver2 extends A
{
	public static void main(String[]args)
	{
		System.out.println("class driver1 main(String[])");
		System.out.println(i);
	}
}

//static variable can inherited