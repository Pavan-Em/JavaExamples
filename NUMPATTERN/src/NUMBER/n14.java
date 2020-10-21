//pattern  T U V X Y Z   input:7
package NUMBER;
import java.util.Scanner;
public class n14 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=7;i>0;i--)
		{
			System.out.print((char)(65+(26-i))+" ");
		}
	}
}
