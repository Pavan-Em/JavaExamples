package ONE;
import java.util.regex.*;
public class r3 {
	public static void main(String[] args) {
		String st="js5@76 .H9s(";
		System.out.println("Example for \\s: space chareter");
		Pattern p=Pattern.compile("[\\s]");
		Matcher m=p.matcher(st);
		System.out.println("Start index\tPattern");
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
		System.out.println("===================");
		System.out.println("Example for \\S: Except space chareter");
		Pattern p2=Pattern.compile("[\\S]");
		m=p2.matcher(st);
		System.out.println("Start index\tPattern");
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
		System.out.println("===================");
		System.out.println("Example for \\d: only digit");
		Pattern p3=Pattern.compile("[\\d]");
		m=p3.matcher(st);
		System.out.println("Start index\tPattern");
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
		System.out.println("===================");
		System.out.println("Example for \\D: Except digit");
		Pattern p4=Pattern.compile("[\\D]");
		m=p4.matcher(st);
		System.out.println("Start index\tPattern");
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
		System.out.println("===================");
		System.out.println("Example for \\w:Any word charater([A-Za-z0-9])");
		Pattern p5=Pattern.compile("[\\w]");
		m=p5.matcher(st);
		System.out.println("Start index\tPattern");
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
		System.out.println("===========================");
		System.out.println("Example for \\W: Except Word Character");
		Pattern p6=Pattern.compile("[\\W]");
		m=p6.matcher(st);
		System.out.println("Start index\tPattern");
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
		System.out.println("=========================");
		System.out.println("Example for .: Any Character");
		Pattern p7=Pattern.compile(".");
		 m=p7.matcher(st);
		System.out.println("Start index\tPattern");
		while(m.find())
		{
			System.out.println(m.start()+"\t\t"+m.group());
		}
	}
}
