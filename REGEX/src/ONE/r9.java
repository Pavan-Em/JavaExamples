package ONE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r9 {
	public static void main(String[] args) {
		String st="hey how r 98man u 45 ohoh ";
		Pattern p=Pattern.compile("[a-z]+");
		Matcher m=p.matcher(st);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
