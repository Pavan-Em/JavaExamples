class fab1static
{
	static int a;//TOTALLY WRONG SO USE 2 STATIC VARIABLE
	public static void main(String[]args)
	{
		fab(20);
	}
	public static int fab(int b)
	{
		if(b==1)
		{
			System.out.print(b+" ");
			return b;
		}
		a=num(b-1)+a;
		System.out.print(a+" ");
		return a;
	}
	public static int num(int b)
	{
		if(b==1)
		{
			System.out.print(b+" ");
			return b;
		}
		a=num(b-1)+a;
		System.out.print(a+" ");
		return a;
	}

}