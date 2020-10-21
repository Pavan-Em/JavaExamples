class fab2
{
	static int a,d;
	public static void main(String[]args)
	{
		fa(10);
	}
	public static int fa(int b)
	{
		
		if(b==1)
		{
			return b;
		}
		a=num(b-1)+a;
		System.out.println(a);
		return a;
	}
	public static int num( int b)
	{
		
		if(b==1)
		{
			return b;
		}
		d=fa(b-1)+d;
		System.out.println(d);
		return d;
	}

}