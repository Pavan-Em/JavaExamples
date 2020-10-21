//strong num
class strong
{
	static int a=145;
	public static void main(String[]args)
	{
		int num=strong.a;
		int sum=0;
		while(num>0)
		{
			int d=num%10;
            sum=sum+fact(d);
			num=num/10;
		}
		
		if(sum==strong.a)
			System.out.println(strong.a+" is a strong num");
		else
			System.out.println(strong.a+" is not a strong num");
	}
		public static int fact(int x)
		{
			if(x==1)
				return 1;
			return fact(x-1)*x;
		}

}