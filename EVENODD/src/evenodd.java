class evenodd
{
	public static void main(String[]args)
	{
		boolean check=check(20);
		if(check)
		{
			System.out.println("Even Num");
		}
		else
			System.out.println("Odd Num");
	}

	static boolean check(int x)
	{
		boolean even=true;
		for(int i=1;i<=x;i++)
		{
			even=!even;
		}
		return even;
	}
}

