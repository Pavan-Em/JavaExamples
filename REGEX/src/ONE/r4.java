package ONE;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter phone no:");
		String st=s.nextLine();
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(st);
		if(m.find() && m.group().equals(st))
		{
			System.out.println("Valid Phone NUmber");
			System.out.println(m.group());
		}
		else
		{
			System.out.println("Invalid Phone Number");
			//System.out.println(m.group());
		}
	}
}
