class A
{
	static void test()
	{
		System.out.println("from A");
	}
}

class B extends A
{
	void test()
	{
		System.out.println("from B");
	}
}

class doubt1
{
	public static void main(String[]args)
	{
		/*B.test();
		A.test();
		B obj1=new B();
		obj1.test();
		A obj2=new B();
		obj2.test();
		A obj3=new A();
		obj3.test();
		A obj4=new B();
		B obj5=(B)obj4;
		obj5.test();*/
	}
}