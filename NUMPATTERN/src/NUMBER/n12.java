//pattern G F E D C B A input:7
package NUMBER;
import java.util.Scanner;
public class n12 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=n;i>0;i--)
		{
			System.out.print((char)(64+i)+" ");
		}
	}
}
