class A
{
	static int i=33;
	int p=1;
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
	static int j=66;
	int q=2;
	C objc=new C();
	static
	{
		System.out.println("from B");
	}
	{
		System.out.println("non static from B");
		/* c objc=new c();  */ //(objc become local to NS block)cant use this here bcoz we cant use objc inside drive class
	}
}
class C extends A
{
	static int k=99;
	int r=3;
	static 
	{
		System.out.println("from C");
	}
	{
		System.out.println("non static from C");
	}
}
class drive1
{
	public static void main(String[]args)
	{
		B objb=new B();
		System.out.println(objb.objc.k);//66
	}
}

/*     OUTPUT
	   from A
	   from B
	   non static from A
	   from C
	   non static from A
	   non static from C
	   non sttaic from B
	   66               */