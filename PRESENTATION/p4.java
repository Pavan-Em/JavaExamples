class p4
{
	String name="Pavan";
	p4()
	{
		System.out.print("Hi ");
	}
	p4(int a)
	{
		this();
		System.out.print("i ");
	}
	p4(int a,int b)
	{
		this(1);
		System.out.print("am ");
	}
	p4(int a,int b,int c)
	{
		this(1,2);
		System.out.print(this.name+" ");
	}
	p4(int a,int b,int c,int d)
	{
		this(1,2,3);
		System.out.print("from ");
	}
	p4(int a,int b,int c,int d,int e)
	{
		this(1,2,3,4);
		System.out.print("Q spiders ");
	}
	public static void main(String[]args)
	{
		new p4(1,2,3,4,5);
	}
}