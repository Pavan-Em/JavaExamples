class f9
{
	final static void add(int x)
	{
		System.out.println(x);
	}

	final void sub(int y)
	{
		System.out.println(y);
	}

	public static void main(String[]args)
	{
		add(10);
		f9 obj =new f9();
		obj.sub(30);
	
		add(90);
		obj.sub(80);

	}
}