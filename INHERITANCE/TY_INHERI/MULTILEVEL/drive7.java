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
class drive7
{

	public static void main(String[]args)
	{
		C obj=new C();
		System.out.println(obj.i);
		System.out.println(obj.p);
	}
}

/* preference given to father of child not for grand father   */
/* OUTPUT
   from A
   from B
   from C
   non static from A
   non static from B
   non static from C
   66
   2             */

   /* ALL THESE EXAMPLES ARE SAME FOR METHODS ALSO   */
