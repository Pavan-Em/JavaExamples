//pattern A b C d E f G
package NUMBER;
import java.util.Scanner;
public class n16 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print((char)(32*(3-i%2)+i)+" ");
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			System.out.print((char)(32*(2+i%2)+i)+" ");
		}
	}
}
