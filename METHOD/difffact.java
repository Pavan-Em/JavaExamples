class difffact
{
	static int fact(int x)
	{
		if(x==1)
			return 1;
		return fact(x-1)*x;
	}
	public static void main(String[]args)
	{
		int a,b,c;
		a=5;b=6;c=7;
		int sum=fact(a)+fact(b)+fact(c);
		System.out.println(sum);
		System.out.println("Sum of "+a+"!,"+b+"!,"+c+"! = "+fact(a)+"+"+fact(b)+"+"+fact(c)+"="+sum);
	}
}