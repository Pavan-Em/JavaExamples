//pattern 1 2 3 4 3 2 1   Input:4
package NUMBER;
import java.util.Scanner;
public class n23 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=-n+1;i<n;i++)
		{
			System.out.print(n-Math.abs(i)+" ");
		}
	}
}
