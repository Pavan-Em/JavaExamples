//find duplictes in the given String
package assignment;
import java.util.Scanner;
public class a6 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String1:");
		String s1=s.nextLine().trim();
		System.out.print("Enter String2:");
		String s2=s.nextLine().trim();
		String dup="";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			for (int j=0;j<s2.length();j++)
			{
				if(count<s2.length())//for normal multiple duplicate no need to write this like for pavan and av itll show 3 duplicate a,v,a to avoid that write this
				{
				if(s2.charAt(j)==s1.charAt(i))
				{
					count++;
					dup=dup+s2.charAt(j)+",";
					break;
				}
				}
			}
		}
		System.out.printf("Number of Duplicate chareter present in \"%s\" and \"%s\" is %d they are %s ",s1,s2,count,dup);
	}
}
