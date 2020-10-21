//pattern 7 6 5 4 3 2 1  intput:7
package NUMBER;
import java.util.Scanner;
public class n2 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=n;i>0;i--)
		{
			System.out.print(i+" ");
		}
	}
}
