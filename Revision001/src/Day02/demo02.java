package Day02;

import java.util.Scanner;

public class demo02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String st = s.next().trim().toUpperCase();
		
		for(int i=0 ; i<st.length();i++)
		{
			System.out.print((char)(st.charAt(i)+((i%2)*32)));
		}
		String str ="";
		for(int i=0 ; i<st.length();i++)
		{
			str=st.charAt(i)+str;
		}
		System.out.println("\n"+str);
	}
}
