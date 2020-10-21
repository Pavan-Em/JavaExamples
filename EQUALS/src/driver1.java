class A
{
	int a;
	int b;
}

class B extends A
{
	int a;
	int b;
}

class driver1
{
	public static void main(String[]args)
	{
		A obj=new A();
		B obj1=(B)obj;
		System.out.println(obj.equals(obj1));
	}
}