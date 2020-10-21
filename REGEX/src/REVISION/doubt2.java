package REVISION;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class doubt2 {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("(Mr[.]?\\s[A-Z}]\\w*)");
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		Matcher m=p.matcher(st);
		if(m.find() && m.group().equals(st))
		{
			System.out.println("Matched");
			System.out.println(st+"   --->    "+m.group());
		}
		else
			System.out.println("Not Matching");
		System.out.println("the end");
	}
}
