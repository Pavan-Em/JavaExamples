class nsdoubt5
{
 int a=10;
	{
		System.out.println(20);
	}
	nsdoubt5()
	{
		System.out.println(40);
	}
	nsdoubt5(int x)
	{
		this();
		System.out.println(x);
	}
	public static void main(String[]args)
	{
		
		new nsdoubt5(50);
		new nsdoubt();
	}
}
//output
//20
//40
//50
//20
//40