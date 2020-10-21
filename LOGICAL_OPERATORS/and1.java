class and1
{
	public static void main(String[]args)
	{
		int a=10;
		int b=30;
		boolean res=10 != 10 && ++a<b++;
		System.out.println(res);//false
		System.out.println(a);//10
		System.out.println(b);//30
		int c=60;
		int d=30;
		boolean result=++c>d++ && ++c>++d && ++c>90;
		System.out.println(result);//false
		System.out.println(c);//63
		System.out.println(d);//32
	}
}