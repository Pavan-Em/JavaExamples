class fab
{
	static int a,d;
	public static void main(String[]args)
	{
		fa(20);
	}
	public static int fa(int b)
	{
		if(b==1)
		{
			System.out.print(0+" ");
			return b;
		}
		fab.a=num(b-1)+fab.a;
		System.out.print(fab.a+" ");
		return fab.a;
	}
	public static int num( int b)
	{
		if(b==1)
		{
			System.out.print(0+" ");
			return b;
		}
		fab.d=fa(b-1)+fab.d;
		System.out.print(fab.d+" ");
		return fab.d;
	}

}