 class A
{
	int i=66;
	static
	{
		System.out.println("from A");
	}
	{
		System.out.println("non static A");
	}
}
class B extends A
{
	
	static
	{
		System.out.println("from B");
	}
	{
		System.out.println("non static B");
	}
}
class doubt17
{
	public static void main(String[]args)
	{
		B obj=new B();
		System.out.println(obj.i);
	}
} 