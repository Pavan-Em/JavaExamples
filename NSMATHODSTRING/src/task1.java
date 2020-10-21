/*
WAJP to read Company Name, and Employee name, generate
a new attribute called code: by merging fisrt 3 characters of company name
with first 3 characters of  employee name.
*/

import java.util.Scanner;
public class task1 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String com_name="AMAZON";
		System.out.print("Enter the Name:");
		String name=s.nextLine().toUpperCase();
		String code=com_name.substring(0,3).concat(name.substring(0,3));
		System.out.println("Company Code:"+code);
		s.close();
	}
}
