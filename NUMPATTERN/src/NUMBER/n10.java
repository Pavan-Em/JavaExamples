//pattern * # @ * % @ *    Input:7  every 5th shud be %
package NUMBER;
import java.util.Scanner;
public class n10 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
				System.out.print("% ");
			else if(i%3==1)
				System.out.print("* ");
			else if(i%3==2)
				System.out.print("# ");
			else
				System.out.print("@ ");
		}
	}
}
