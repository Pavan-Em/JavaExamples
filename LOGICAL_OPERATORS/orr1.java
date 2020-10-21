class orr1
{
	public static void main(String[]args)
	{
		int a=9;
		int b=6;
		boolean res=10!=10 || a++<++b;
		System.out.println(res);//false
		System.out.println(a);//10
		System.out.println(b);//7
		boolean resu= 10 == 10 || ++a>++b;
		boolean result= ++a>b++ || a>b;
		boolean results=a++<b-- || 10<10 || --a<--b;
		System.out.println(resu);//true
		System.out.println(result);//true
		System.out.println(results);//false
	}
}