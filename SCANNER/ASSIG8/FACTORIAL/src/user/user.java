package user;

import fact.fact;
import java.util.Scanner;

class user
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enetr the Number:");
		int a=s.nextInt();
		double res=fact.facto(a);
		System.out.println("Factorial of "+a+"!"+" is "+res);
	}

}