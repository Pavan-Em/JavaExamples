class A
{
	int i=1;
}
class B extends A
{
	int i=2;
}

class doubt5
{
	public static void main(String[]args)
	{
		A a1=new B();
		System.out.println(a1.i);
	}
}