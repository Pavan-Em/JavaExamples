//pattern Aa Bb Cc Dd Ee Ff Gg  Input:7
package NUMBER;
import java.util.Scanner;
public class n15 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print((char)(64+i)+""+(char)(96+i)+" ");
		}
	}
}
