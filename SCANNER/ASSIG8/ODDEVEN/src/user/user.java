package user;

import oddeven.oddeven;
import java.util.Scanner;

class user
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Check Num is Even or odd:");
		int a=s.nextInt();
		boolean res=oddeven.evenodd(a);
		if(res)
		System.out.println(a+" is a Even Num");
		else
			System.out.println(a+" is a Odd Num");
	}
}