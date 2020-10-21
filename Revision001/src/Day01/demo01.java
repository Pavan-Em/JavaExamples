package Day01;

import java.util.*;
import java.io.*;

public class demo01 {

	public static void main(String[] args) {
		String s = "a c2c b";
		
		Scanner ss = new Scanner(s);
		
		ss.useDelimiter("2");
		
		while(ss.hasNext())
		{
			System.out.println(ss.next());
		}
		System.out.println(ss.delimiter());
		
	}
}
