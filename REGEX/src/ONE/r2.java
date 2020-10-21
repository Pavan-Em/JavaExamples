package ONE;
import java.util.regex.*;
public class r2 {
	public static void main(String[] args) {
		String st="a54%bbc%4";
		Pattern p=Pattern.compile("[a-z]");
		Matcher m=p.matcher(st);
		System.out.println("Start index\tpattern");
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
		System.out.println("==============================");
	
		Pattern p2=Pattern.compile("[^a-z]");
		m=p2.matcher(st);
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
	}
}
