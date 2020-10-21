//count vowels in string
package assignment;
import java.util.Scanner;
public class A3 {
	public static void main(String[]atgs)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("ENter String:");
		String s1=s.nextLine().trim();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||
					s1.charAt(i)=='U'||s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||
					s1.charAt(i)=='o'||s1.charAt(i)=='u')
				count++;
		}
		System.out.printf("Vowles present in \"%s\" are %d",s1,count);
	}
}
