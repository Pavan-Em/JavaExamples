import java.util.Scanner;

class A
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int a,b,res;
		System.out.print("Enter A:");
		a=s.nextInt();
		System.out.print("Enter B:");
		b=s.nextInt();
		res=a+b;
		System.out.println(res);
	}
}