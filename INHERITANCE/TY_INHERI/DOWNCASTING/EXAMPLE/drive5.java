class drive5
{
	public static void main(String[]args)
	{
		A obj1=new B();
		System.out.println("i:"+obj1.i);
		B obj2=(B)obj1;
		System.out.println("i:"+obj2.i);
	}
}