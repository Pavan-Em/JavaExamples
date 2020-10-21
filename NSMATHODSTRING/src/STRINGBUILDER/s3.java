package STRINGBUILDER;
import java.util.Scanner;
public class s3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String1:");
		StringBuilder s1=new StringBuilder(s.nextLine().trim());
		System.out.print("Enter String2:");
		StringBuilder s2=new StringBuilder(s.nextLine().trim());
		if(s1.length()==s2.length())
		{
			int i;
			for( i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
					continue;
				else
					break;
			}
			if(i==s1.length())
				System.out.println("Both String are Same");
			else
				System.out.println("Both String are Not Same");
		}
		else
			System.out.println("Both String are Not Same");
		
		///\ or or or or or or or or or or or or or or or or or or or
		System.out.println("===========================================");
		if(s1.length()==s2.length())
		{
			if(s1.compareTo(s2)==0)
				System.out.println("Both String are Same");
			else
				System.out.println("Both String are Not Same");
		}
		else
			System.out.println("Both String are Not Same");
		
	}
}
