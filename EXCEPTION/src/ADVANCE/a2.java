package ADVANCE;

import java.util.Scanner;

public class a2 {
	public static void main(String[] args) {
		int a=1;
		Scanner s=new Scanner(System.in);
		
		do
		{
			try
			{
				System.out.println("Enter 2 num");
				int x=s.nextInt();
				int y=s.nextInt();
				System.out.println(x/y);
				a=2;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Dont enter 0");
			}
		}while(a==1);
	}
}
