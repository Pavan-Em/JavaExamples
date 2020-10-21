interface i1
{
	static int i=10;
}
interface i2
{
	static int i=20;
}
interface i3 extends i1,i2
{
	static int i=30;
}

class demo5 implements i1,i2,i3
{
	static int i=40;
	public static void main(String[]args)
	{
		System.out.println(i);
	}
}
class demo6
{
	public static void main(String[]args)
	{
		System.out.println(i3.i);
	}
}