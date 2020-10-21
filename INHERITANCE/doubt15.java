class A
{
	void test()
	{
		System.out.println(this.i);//in super class we cannot use the members of sub class
	}
}
class B extends A
{
	int i=33;
	void exam()
	{
	System.out.println(this.i);
	}
}
class doubt15
{
	public static void main(String[]args)
	{
		B obj=new B();
		obj.test();
	}
}

//OUTPUT
//CTE bcoz i is not declared inside class A so i'll give compile time error

//very impt note it




