//pattern 1 -9 2 -8 3 -7 4 -6 5   Input=9
package NUMBER;
import java.util.Scanner;
public class r19 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
				System.out.print((i/2)+1+" ");
			else
				System.out.print((i/2)-10+" ");
		}
	}
}
