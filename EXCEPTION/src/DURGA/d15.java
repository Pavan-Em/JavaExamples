package DURGA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class d15 {
	public static void main(String[] args) {
		int a=1;
		do {
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter 1St num:");
			int n=s.nextInt();
			System.out.println("ENter 2nd num:");
			int m=s.nextInt();
			System.out.println("Divided:"+(n/m));
			a=2;
		}
		catch(InputMismatchException|ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}while(a==1);
		System.out.println("bye bye");
	}
}
