class length
{
	public static void main(String[]args)
	{
		int num = 222;
		int lth=0;
		while(num != 0)
		{
			num=num/10;
			lth=++lth;// or lth=lth+1;
		}
		System.out.println(lth);
	}
}