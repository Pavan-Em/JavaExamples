package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class demo04 {

	public static void main(String[] args) {
		
		ArrayList<String> st1 = new ArrayList<String>(Arrays.asList("pavan","kera","fooju"));
		
		ListIterator<String> itr = st1.listIterator(st1.size());
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
