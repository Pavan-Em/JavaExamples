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
	static void test()
	{
		System.out.println("method of A");
	}
}
class B extends A
{
	static int p=2;
	int i=66;
	static 
	{
		System.out.println("from B");
		C obj=new C();//CREATE OBJ FOR C and try this later and write inside non static block
	}
	{
		System.out.println("non static from B");
	}
	static void exam()
	{
		System.out.println("method of B");
	}
}
class C extends B
{
	static int p=3;
	int i=99;  
	static 
	{
		System.out.println("form c");
	}
	{
		System.out.println("non statci from C");
	}
	static void quiz()
	{
		System.out.println("method of C");
	}
}
class mustdrive8
{

	public static void main(String[]args)
	{
		B obj=new B();//CREATE OBJECT OF B
		System.out.println(obj.i);
		System.out.println(obj.p);
	}
}

/* OUTPUT
   from A
   from B
   from c
   non static from A
   non static from B
   non static from C
   non static from A
   non static from B
   66
   2                          */   //impt dont forget this shit