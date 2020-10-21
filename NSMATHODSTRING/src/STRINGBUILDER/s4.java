//read firstname and lastname and store in StringBuilder in uppercase
package STRINGBUILDER;
import java.util.Scanner;
public class s4 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter First Name:");
	String fn=s.nextLine().trim();
	System.out.print("Enter Last Name:");
	String ln=" "+s.nextLine().trim();
	StringBuilder f=new StringBuilder(fn.concat(ln));
	StringBuilder fullname=new StringBuilder();
	for(int i=0;i<f.length();i++)
	{
		if(f.charAt(i)==' ')
			fullname.append(f.charAt(i));
		else if(f.charAt(i)>='A'&&f.charAt(i)<='Z')
			fullname.append(f.charAt(i));
		else
			fullname.append((char)(f.charAt(i)-32));
	}
	System.out.println("FULLNAME:"+fullname);
	
	String a="hey pavan";
	StringBuilder b=new StringBuilder("hey pavan");
	String c=new String("hey pavan");
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	}
}
