class armstrong
{
	public static void main(String[]args)
	{
		int num=23233;
		int no1=num;
		int length=0;
		while (no1 !=0)
		{
			length=++length;
			no1=no1/10;
		}
		int no2=num;
		int armnum=0;
		while (no2!=0)
		{
			int mul=1;
			no2=no2%10;
		for (int i=1;i<=length ;i++ )
		{
			mul=mul*no2;
		}
		armnum=armnum+mul;
		no2=no2/10;
		}
		if (armnum==num)
			System.out.println(num+" is an armstrong number");
		else
			System.out.println(num+" is not an armstrong number");
	}
}