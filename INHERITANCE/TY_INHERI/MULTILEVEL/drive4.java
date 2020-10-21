//EXAMPLE USING OBJ REF (NON STATIC VARIABLE)
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
class drive4
{
	public static void main(String[]args)
	{
		C obj=new C();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
	}
}

/*	  OUTPUT
	  from A
	  from B
	  from C
	  non static from A
	  non static from B
	  non static from c
	  33
	  66
	  99    */

