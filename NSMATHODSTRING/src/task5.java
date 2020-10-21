//1st letter upper remaining lower case
import java.util.Scanner;
public class task5 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enetr Name:");
		String name=s.nextLine().trim().toUpperCase();
		name=name.charAt(0)+name.substring(1,name.length()).toLowerCase();
		System.out.println("proprt Name:"+name);
		
		
	}
}
