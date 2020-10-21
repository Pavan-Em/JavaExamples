package QUEUE.PRIORITYQUEUE;
import java.util.*;
public class pq5 {
	public static void main(String[] args) {
		PriorityQueue<Integer> num=new PriorityQueue<Integer>(Arrays.asList(2,4,5,7,1,4,3));
		System.out.println(num);
		Iterator<Integer> itr=num.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
