interface i8
{
	static int i=10;
}
interface i9
{
	static int i=20;
}

interface demo4 extends i8
{
	public static void main(String[]args)
	{
		System.out.println(i8.i);
	}
}