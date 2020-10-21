package COMMON;

import java.util.Scanner;

public class justdoit1 {
	public static void main(String[] args) {
		String s="hey 23 my fuck sack 23 ok";
		Scanner st=new Scanner(s);
		st.useDelimiter("[^a-zA-z0-9]+");
		while(st.hasNext())
		{
			System.out.println(st.next());
		}
		System.out.println("Delimeter used : "+st.delimiter());
	}
}
