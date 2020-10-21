//pattern * # @ * # @ *   Input:7
package NUMBER;
import java.util.Scanner;
public class n9 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Input:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==1)
				System.out.print('*'+" ");
			else if(i%3==2)
				System.out.print('#'+" ");
			else
				System.out.print('@'+" ");
		}
	}
}
