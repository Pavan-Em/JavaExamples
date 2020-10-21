package pack1;

class C extends A
{
	public static void main(String[]args)
	{
		C obj1=new C();
		System.out.println("using sub class obj ref "+obj1.i);
		A obj2=new A();
		System.out.println("using super class obj ref "+obj2.i);
	}
}

//we can use protected members in sub class using sub and super class obj ref in same package