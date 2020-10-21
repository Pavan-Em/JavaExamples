package COMMON;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class prioque {
	public static void main(String[] args) {
		
		PriorityQueue<String> que = new PriorityQueue<String>(new heyNoDuplicate());
		que.offer("pavan");
		que.offer("akash");
		que.offer("jordi");
		que.offer("pavan");
		que.offer("rudra");
		que.offer("byra");
		que.offer("jordi");
		que.offer("seena");
		System.out.println(que);
		
		TreeSet<String> quee = new TreeSet<String>(new heyNoDuplicate());
		for(String s : que)
		{
			quee.add(s);
		}
		//System.out.println("TreeSet : "+quee);
		que.clear();
		for(String s : quee)
		{
			que.offer(s);
		}
		System.out.println(que);
		
		
		TreeSet<String>  que2 = new TreeSet<String>(new heyNoDuplicate());
		que2.add("pavan");
		que2.add("akash");
		que2.add("jordi");
		que2.add("pavan");
		que2.add("rudra");
		que2.add("byra");
		que2.add("jordi");
		que2.add("seena");
		System.out.println(que2);
		
	}
}

class heyNoDuplicate implements Comparator<String>
{
	public int compare(String obj1 , String obj2)
	{
		return obj1.compareTo(obj2);
	}
}
