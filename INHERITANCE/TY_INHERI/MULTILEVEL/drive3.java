//EXAMPLE USING OBJ REF (STATIC VARIABLE)
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
class drive3
{
	public static void main(String[]args)
	{
		C obj=new C();
		System.out.println(obj.p);
		System.out.println(obj.q);
		System.out.println(obj.r);
	}
}
/* IMPORTAND POINTS
   First loading starts from A so all the static blocks gets executed from class A to C
   then loading process of object is started so non staic blocks gets executed from class A to C  */