//reverse given String
package assignment;
import java.util.Scanner;
public class a5 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String:");
		String s1=s.nextLine().trim();
		String rev="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reversed String:"+rev);
	}
}

//we can do this using substring() also
