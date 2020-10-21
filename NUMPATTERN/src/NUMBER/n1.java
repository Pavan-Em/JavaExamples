//pattern 1 2 3 4 5 6 7 input:7
package NUMBER;
import java.util.Scanner;
public class n1 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
	}
}
