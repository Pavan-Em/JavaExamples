class A
{
	void print()
	{
		System.out.println("From class A print()");
	}
}
class B extends A
{

}
class driver2
{
	public static void main(String[]args)
	{
		B obj1;
		obj1=new B();//object of sub class
		obj1.print();
	}
}
//Non static method can be inherited