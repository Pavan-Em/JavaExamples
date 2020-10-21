class A
{
	static void print()
	{
		System.out.println("class A print()");
	}
}

class driver4 extends A
{
	public static void main(String[]args)
	{
		System.out.println("String driver3 main(String[])");
		print();
	}
}

//static method can be inherited
//static member are inherited in to the sub class