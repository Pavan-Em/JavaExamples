//pattern 1 * A 2 * B 3 * c 4    Input:10
package NUMBER;
import java.util.Scanner;
public class r20 {
	public static void mian(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==1)
				System.out.print(i+(i/2)+" ");
			else if(i%3==2)
				System.out.print("* ");
			else
				System.out.print((char)(64+(i/3))+" ");
		}
	}
}
