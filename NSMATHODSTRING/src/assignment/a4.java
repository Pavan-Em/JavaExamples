//count number od uppercase in the given String
package assignment;
import java.util.Scanner;
public class a4 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String:");
		String s1=s.nextLine().trim();
		int count=0;
		for (int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')
				count++;
		}
		System.out.printf("Number of Uppercase present in \"%s\" is %d",s1,count);
	}
}
