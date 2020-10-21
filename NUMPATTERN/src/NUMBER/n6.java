//pattern 1 4 9 16 25 36 49   input:7
package NUMBER;
import java.util.Scanner;
public class n6 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i*i+" ");
		}
	}
}
