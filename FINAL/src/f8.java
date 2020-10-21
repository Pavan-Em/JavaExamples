class f8
{
	static int i=10;

	{
		i=20;
	}

	public static void main(String[]args)
	{
		System.out.println(i);
		f8 obj=new f8();
		System.out.println(obj.i);
		System.out.println(i);
	}
}