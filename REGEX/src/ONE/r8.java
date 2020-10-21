package ONE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r8 {
	public static void main(String[] args) {
		String target="heyheyhey";
		
		Pattern p=Pattern.compile("[a-z]+");
		Matcher m=p.matcher(target);
		if(m.find())
		{
			System.out.println(m.group());
		}
	}
}
