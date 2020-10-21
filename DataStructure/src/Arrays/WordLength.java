package Arrays;

import java.util.Scanner;

public class WordLength {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String name = s.next();
		
		System.out.println("hey");
		char[] chname = name.toCharArray();
		int n=0;
		for(Character c : chname)
		{
			n++;
		}
		
		System.out.println("Length of String is : "+n);
	}
}
