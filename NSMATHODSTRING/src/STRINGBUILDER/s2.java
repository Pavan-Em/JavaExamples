//reverse string using StringBuilder
package STRINGBUILDER;
import java.util.Scanner;
public class s2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String:");
		StringBuilder s1=new StringBuilder(s.nextLine().trim());
		StringBuilder s2=new StringBuilder();
		for (int i=s1.length()-1;i>=0;i--)
		{
			s2.append(s1.charAt(i));
		}
		System.out.println("Entered String:"+s1);
		System.out.println("Reversed String:"+s2);
	}
}
