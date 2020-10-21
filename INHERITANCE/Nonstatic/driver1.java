class A
{
	int i=10;
}
class B extends A
{

}
class driver1
{
	public static void main(String[]args)
	{
		B obj1;
		obj1=new B();//objrct of sub class
		System.out.println(obj1.i);
	}
}
//Non static variable can be inherited