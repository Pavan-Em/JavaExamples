class A
{
	static int i=test();
	static int test()
	{
		return 20;
	}
}
class B extends A
{

}
class doubt2
{
	public static void main(String[]args)
	{
		System.out.println(B.i);//yes i got 20
	}
}