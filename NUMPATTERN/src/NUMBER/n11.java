//patter A B C D E F G  input:7
package NUMBER;
import java.util.Scanner;
public class n11 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print((char)(64+i)+" ");
		}
	}
}
