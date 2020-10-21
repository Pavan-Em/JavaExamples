class A
{
	int x=3;
	A(int x)//waste of using this perticular x inside any non static method of same class
	{
		test();
	}
	void test()
	{
		System.out.println(x);//IT'LL USE NON STATIC VARIABLE
	}
}
class doubt9
{
	public static void main(String[]args)
	{
		new A(6);
	}
}