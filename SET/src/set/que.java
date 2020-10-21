package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class que {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.offer(1);
		q.offer(20);
		q.offer(5);
		q.offer(12);
		q.offer(15);
		q.offer(9);
		q.offer(6);
		q.offer(1);
		System.out.println(q);
		HashSet<Integer> set = new HashSet<Integer>(q);
		q.clear();
		for(Integer i : set)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}

class NoDuplicate<E> extends PriorityQueue<E>
{
	public boolean offer(E e)
	{
		boolean isAdded = false;
		if(!super.contains(e))
			isAdded=super.offer(e);
		return isAdded;
	}
}

class heyComparetor implements Comparator<Integer>
{
	public int compare(Integer obj1 , Integer obj2)
	{
		return obj2-obj1;
	}
}
