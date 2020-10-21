package user;
import prieven.prieven;
import java.util.Scanner;

class user
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int m,n;
		System.out.print("Enter value of m:");
		m=s.nextInt();
		System.out.print("Enter valur of n:");
		n=s.nextInt();
		prieven.printeven(m,n);
	}

}