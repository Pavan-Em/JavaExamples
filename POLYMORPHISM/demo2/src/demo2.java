class A
{
	static int i=11;
}

class B extends A
{
	 static int i=22;
	 void details()
	{
		B obj1=new B();
		System.out.println(i);
		System.out.println(obj1.i);
		System.out.println(super.i);
	}
}

class demo2
{
	public static void main(String[]args)
	{
		B obj=new B();
		obj.details();
		System.out.println((obj).i);
	}
}