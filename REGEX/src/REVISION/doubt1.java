package REVISION;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class doubt1 {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("a*");
		String s="abaabaaab";
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group()+"--->"+m.start());
		}
		
		String[] st=p.split(s);
		System.out.println(Arrays.toString(st));
	}
}
