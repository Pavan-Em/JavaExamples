package set;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.IntFunction;

public class que2 {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> aq = new ArrayDeque<Integer>();
		aq.offer(3);
		aq.push(5);
		aq.offer(1);
		//System.out.println(aq.poll());
		System.out.println(aq);
		
		Iterator<Integer> itr=aq.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Integer[] i = aq.toArray(new Integer[aq.size()]);
		Arrays.sort(i);
		aq.clear();
		for(Integer in : i)
		{
			aq.offer(in);
		}
		
		System.out.println(aq);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	}
}
