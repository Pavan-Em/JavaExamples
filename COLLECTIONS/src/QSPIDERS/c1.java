package QSPIDERS;
import java.util.*;
public class c1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList l=new ArrayList();
		System.out.print("Enter Number Of Element:");
		int n=0;
		int a=0;
		do
		{
		try
		{
			n=s.nextInt();
			a=1;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter Number Only");
			s.nextLine();
		}
		}while(a==0);
		System.out.println("Add Elements");
		for(int i=0;i<n;i++)
		{
			int b=0;
			do
			{
			try
			{
				l.add(s.nextInt());
				b=1;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Enter Number Only..");
				s.nextLine();
			}
			}while(b==0);
		}
		System.out.println(l);
		System.out.println(l.size());
	}
}
