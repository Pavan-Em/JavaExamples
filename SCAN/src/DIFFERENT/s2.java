package DIFFERENT;
import java.util.Scanner;
import java.util.regex.Pattern;
public class s2 {
	public static void main(String[] args) {
		String s="hey im 26 pavan hehe no man 23 or 24";
		Scanner sc=new Scanner(s);
		sc.useDelimiter("2");
		
		//sc.useDelimiter(" ");
		
		//while(sc.hasNext())
		//{
			System.out.println(sc.next());
		//}
		
		System.out.println("used delimeter:"+sc.delimiter());
		
		sc.useDelimiter(" ");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
		
		System.out.println("new used delimiter:"+sc.delimiter());
	}
}
