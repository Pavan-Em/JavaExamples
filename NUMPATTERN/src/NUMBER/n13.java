//pattern Z Y X W V U T   input:7
package NUMBER;
import java.util.Scanner;
public class n13 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print((char)(65+(26-i))+" ");
		}
	}
}
