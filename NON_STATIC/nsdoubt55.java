class nsdoubt55
{
 int a=10;
	{
		System.out.println(20);
	}
	nsdoubt55()
	{
		System.out.println(40);
	}
	nsdoubt55(int x)
	{
		this();
		System.out.println(x);
	}
	public static void main(String[]args)
	{
		
		new nsdoubt55(50);
		new nsdoubt55();
	}
}
//output
//20
//40
//50
//20
//40