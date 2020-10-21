//pattern 1 A 3 B 5 C 7    Input:7
package NUMBER;
import java.util.Scanner;
public class r18 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("input:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				System.out.print(i+1+" ");
			else
				System.out.print((char)(65+(i/2))+" ");
		}
		System.out.println();
		System.out.print("Input:");
		int m=s.nextInt();
		for(int i=1;i<=m;i++)
		{
			if(i%3==1)
				System.out.print(1+(i/3)+" ");
			else if(i%3==2)
				System.out.print("* ");
			else
				System.out.print((char)(64+(i/3))+" ");
		}
	}
}
