class A
{
	int i=66;
	
	void test()
	{
		System.out.println(this.i);//Output is 66
	}
}
class B extends A
{
	int i=33;
	void exam()
	{
	System.out.println(this.i);//output is 33
	}
}
class doubt14
{
	public static void main(String[]args)
	{
		B obj=new B();
		obj.test();//66
		obj.exam();//33
	}
}
//very impt note it












