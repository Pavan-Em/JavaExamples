//pattern 3 2 1 0 1 2 3   input:3
package NUMBER;
import java.util.Scanner;
public class R22 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=-n;i<=n;i++)
		{
			System.out.print(Math.abs(i)+" ");
		}
	}
}
