//FN,MN,LN separately and print using concat

import java.util.Scanner;
public class s3 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enetr FN:");
		String fn=s.nextLine().trim().toUpperCase();
		System.out.print("Enter MN:");
		String mn=" "+(s.nextLine().trim().toUpperCase());
		System.out.print("Enter LN:");
		String ln=" "+(s.nextLine().trim().toUpperCase());
		System.out.println("Name1:"+fn.concat(mn).concat(ln));
		System.out.println("Name2:"+fn+mn+ln);
		System.out.println("Name3:"+fn.concat(mn.concat(ln)));
		System.out.println("Name4:"+fn.concat(mn+ln));
	}

}
