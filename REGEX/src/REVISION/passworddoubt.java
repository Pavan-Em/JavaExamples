package REVISION;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passworddoubt {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*\\W){8,16}");
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		Matcher m=p.matcher(st);
		if(m.find())
		{
			System.out.println("Matching");
		}
		else
			System.out.println("Not Matching");
	}
}
