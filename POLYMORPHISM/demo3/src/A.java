class A
{
	int i=10;
}
class B extends A
{
	int i=20;
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