class A
{
	int i=10;
}
class B extends A
{
	int j=20;
}
class driver3
{
	public static void main(String[]args)
	{
		B obj1=new B();//object of sub class
		System.out.println(obj1.i);
		System.out.println(obj1.j);
	}
}
/*  using sub class reference variable we can use non static memebers of 
     both sub class and super class   */