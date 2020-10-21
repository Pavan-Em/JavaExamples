package ONE;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Email ID:");
		String eid=s.nextLine().trim();
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@gmail([.][a-zA-Z]+)+");
		Matcher m=p.matcher(eid);
		if(m.find()&& m.group().equals(eid))
		{
			System.out.println("Valid Emial ID");
			//System.out.println("Email Id:"+m.group());
		}
		else
			System.out.println("Invalid Email ID");
	}
}
