class prob
{
 int a=10;
	{
		System.out.println(20);
	}
	prob()
	{
		System.out.println(40);
	}
	prob(int x)
	{
		this();
		System.out.println(x);
	}
	public static void main(String[]args)
	{
		
		new prob(50);
		new prob();
	}
}
//output
//20
//40
//50
//20
//40