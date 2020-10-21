//pattern 0 1 0 1 0 1 0   Input:7
package NUMBER;
import java.util.Scanner;
public class n5 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(i%2+" ");
		}
	}
}
