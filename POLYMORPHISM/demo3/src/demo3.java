class A
{
	static int i=10;
}
class B extends A
{
	//static int i=20;
}

class C extends B
{
	//static int i=30;
	//int i=30;

	 void details()
	{
		
		System.out.println(i);
		System.out.println(super.i);
		System.out.println(this.i);
	}
}
class demo3
{
	public static void main(String[]args)
	{
		C obj1=new C();
		obj1.details();
		System.out.println(((B)obj1).i);
	}
}