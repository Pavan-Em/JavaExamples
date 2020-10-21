package DIFFERENT;
import java.util.Scanner;
public class s1 {
	public static void main(String[] args) {
		String s="23 im 26 pavan yo 24 man hehe";
		Scanner sc=new Scanner(s);
		//System.out.println(sc.nextLine());
		while(sc.hasNextLine())
		{
			if(sc.hasNextInt())
			{
				System.out.println("===================");
				System.out.println(sc.nextInt());
				System.out.println("====================");
			}
			else
				System.out.println(sc.next());
		}
	}
}
