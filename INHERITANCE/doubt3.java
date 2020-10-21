class A
{
	static int i=10;
}
class B extends A
{
	
	i=20;//here it'll give compile time error
	public static void main(String[]args)
	{
		i=20;
	}
}
class doubt3
{
	public static void main(String[]args)
	{
		System.out.println(B.i);
	}
}
//CTE

//very impt note it