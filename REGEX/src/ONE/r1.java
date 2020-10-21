package ONE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r1 {
	public static void main(String[] args) {
		String regex="hey";
		
		Pattern pattern=Pattern.compile(regex);
		String s="heyohohhey";
		Matcher matcher=pattern.matcher(s);
		System.out.println(matcher.find(1));
		System.out.println(matcher.start());
		
		
		
		String st="abbbabbaab";
		Pattern p=Pattern.compile("ab");
		int count=0;
		Matcher m=p.matcher(st);
		System.out.println("occurence position:");
		System.out.println("Start index\tEnd index\tPattern");
		while(m.find())
		{
			count++;
			System.out.println(m.start()+"\t\t"+m.end()+"\t\t"+m.group());
		}
		System.out.println("\ntotal num of occurence:"+count);
		
		int a=12_35;
		System.out.println(a);
	}
}
