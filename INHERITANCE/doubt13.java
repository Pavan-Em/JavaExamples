class A
{
	int i=5;
	static 
	{
		System.out.println("from A");
	}
}
class B extends A
{
	static
	{
		System.out.println("from B");
	}
}
class doubt13
{
	public static void main(String[]args)
	{
		A obj=new A();
		System.out.println(obj.i);
	}
}
//OUTPUT
//from A
//5