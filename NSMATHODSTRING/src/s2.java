//read fn and ls separately and print in upper case

import java.util.Scanner;
public class s2 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Name:");
		String first_name=s.nextLine().toUpperCase();
		//s.nextLine();
		System.out.print("Enter Last Name:");
		//s.nextLine();
		String last_name=" "+s.nextLine().toUpperCase();
		System.out.println("Name:"+first_name+last_name);
		System.out.println("Name:"+first_name.concat(last_name));
	}

}
