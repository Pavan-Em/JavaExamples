package SCANNER;

import java.util.Arrays;
import java.util.Scanner;

public class s1 {
	public static void main(String[] args) {
		String s="hey im 24 haha nah 23";
		Scanner ss=new Scanner(s);
		ss.useDelimiter("[^a-zA-Z]+");
		while(ss.hasNext())
		System.out.println(ss.next());
	}
}
