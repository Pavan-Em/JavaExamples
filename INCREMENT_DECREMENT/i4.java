class i4
{
	public static void main(String[]args)
	{
		int a=9;
		int b=++a + 2;
		int c=b++ + a++ + ++a;
		int d=++c - ++a - b++ + c++;
		System.out.println(a);//13
		System.out.println(b);//14
		System.out.println(c);//36
		System.out.println(d);//44
	}
}