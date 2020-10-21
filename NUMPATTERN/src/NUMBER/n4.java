//pattern 14 12 10 8 6 4 2   Input:7
package NUMBER;
import java.util.Scanner;
public class n4 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=n*2;i>0;i-=2)
		{
			System.out.print(i+" ");
		}
	}
}
