import java.util.Scanner;

class r2
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("input first number:");
		int a=s.nextInt();
		System.out.print("input second number:");
		int b=s.nextInt();
		int res=a*b;
		System.out.println(a+"*"+b+"="+res);
	}
}