//pattern 1 3 5 7 9 11 13   Input:7
package NUMBER;
import java.util.Scanner;
public class n3 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<n*2;i+=2)
		{
			System.out.print(i+" ");
		}
	}
}
