//pattern A B C D C B A    Input:4
package NUMBER;
import java.util.Scanner;
public class n24 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=-n+1;i<n;i++)
		{
			System.out.print((char)(64+n-Math.abs(i))+" ");
		}
	}
}
