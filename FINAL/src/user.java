class A
{
	static int add(final int x,final int y)
	{
		final int a=x;
		final int b=y;
		return a+b;
	}
}

class user
{
	public static void main(String[]args)
	{
		int q=A.add(10,20);
		System.out.println(q);
		System.out.println(A.add(60,30));
	}
}