class  nsdoubt3
{
	int a=4;
	{
		System.out.println(5);
	}
	nsdoubt3()
	{
		yo();//we can use static call directly inside costructor..
		yes();
		System.out.println(6);
	}
	public static void main(String[] args) 
	{
		nsdoubt3 b=new nsdoubt3();
		b.yo();
	}
	public void yes()
	{
		System.out.println("yes");
	}
	public static void yo()
	{
		System.out.println(7);
	}
}
//OUTPUT
//5
//7
//yes
//6
//7

