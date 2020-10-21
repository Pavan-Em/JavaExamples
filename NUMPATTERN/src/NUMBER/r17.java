//pattern A Z C X E V G   input:7
package NUMBER;
import java.util.Scanner;
public class r17 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.print((char)(64+i)+" ");
			else
				System.out.print((char)(65+27-i)+" ");
		}
	}
}
