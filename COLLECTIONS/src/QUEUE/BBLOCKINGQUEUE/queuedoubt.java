package QUEUE.BBLOCKINGQUEUE;
import java.util.*;
public class queuedoubt {
	public static void main(String[] args) {
		PriorityQueue<Integer> num=new PriorityQueue<Integer>();
		num.offer(99);
		num.offer(15);
		num.offer(26);
		num.offer(41);
		num.offer(10);
		num.add(63);
		num.offer(60);
		System.out.println(num.poll());
		System.out.println(num.poll());
		System.out.println(num.poll());
		System.out.println(num);
		
		PriorityQueue<String> st=new PriorityQueue<String>();
		st.offer("pavan");
		st.offer("kera");
		st.offer("z");
		st.offer("anand");
		System.out.println(st.poll());
	    System.out.println(st.poll());
		System.out.println(st.poll());
		System.out.println(st);
	}
}

class heycomparetor implements Comparator<String>
{
	public int compare(String e1,String e2)
	{
		return e1.compareTo(e2);
	}
}
