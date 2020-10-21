package ONE;

import java.util.Scanner; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordvalidation {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Password:");
		String pwd=s.nextLine();
		String regex="^(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)[^\\s]+{8,16}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(pwd);
		if(m.find() && m.group().equals(pwd) )
		{
			System.out.println("Valid Password");
			System.out.println("Password:"+m.group());
		}
		else
		{
			System.out.println("Invalid Password");
			//write some info users like it shud not have that
			main(null);
		}
		s.close();
	}
}
