//EXAMPLE USING CLASS NAME (STATIC VARIABLES)
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
	static int q=2;
	int j=66;
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
	static int r=3;
	int k=99;
	static 
	{
		System.out.println("form c");
	}
	{
		System.out.println("non statci from C");
	}
}
class drive2
{
	public static void main(String[]args)
	{
		System.out.println(B.p);
		System.out.println(C.q);
		System.out.println(C.r);
	}
}
/* output is
   from A
   1
   from B
   2
   from C
   3        */