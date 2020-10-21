class id1
{
	public static void main(String[]args)
	{
		int a=25;
		int b=--a - 1;
		int c=a-- - --b + 2 + a--;
		int d=c-- + b-- + --a - 2 + --c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}