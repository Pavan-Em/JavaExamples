//EXAMPLE USING SAME INDENTIFIER FOR STATIC AND NON STATIC VARIABLE(prefarence )
class A
{
	static int p=1;
	int i=33;
	static
	{
		System.out.println("from A");
	}
	{
		System.out.println("non static from A");
	}
}
class B extends A
{
	static int p=2;
	int i=66;
	static 
	{
		System.out.println("from B");
	}
	{
		System.out.println("non static from B");
	}
}
class C extends B
{
	/* static int p=3;
	int i=99;  */
	static 
	{
		System.out.println("form c");
	}
	{
		System.out.println("non statci from C");
	}
}
class drive6
{
	public static void main(String[]args)
	{
		System.out.println(C.p);

	}
}

/* preference given to father of child not for grand father   */
/* OUTPUT
   from A
   from B
   2             */
