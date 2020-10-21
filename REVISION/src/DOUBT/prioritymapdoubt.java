package DOUBT;
import java.util.*;
public class prioritymapdoubt implements Comparable<prioritymapdoubt> {
	
	String name;
	
	public prioritymapdoubt(String name)
	{
		this.name=name;
	}

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new sayno<Integer>();
		pq.add(null);
		pq.add(2);
		pq.add(1);
		pq.add(95);
		pq.add(91);
		pq.add(65);
		pq.add(30);
		pq.add(42);
		pq.add(1);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		
		PriorityQueue<prioritymapdoubt> pq2=new PriorityQueue<prioritymapdoubt>();
		pq2.offer(new prioritymapdoubt("pavan"));
		pq2.offer(new prioritymapdoubt("anand"));
		System.out.println(pq2);
	}
	
	public int compareTo(prioritymapdoubt obj)
	{
		return name.compareTo(obj.name);
	}
	
	public String toString()
	{
		return name;
	}
}


class sayno<E> extends PriorityQueue<E>
{
	public boolean offer(E e)
	{
		boolean isadded=false;
		if(!super.contains(e))
			isadded=super.offer(e);
		return isadded;
	}
}

class sayno2 implements Comparator<Integer>
{
	public int compare(Integer obj1,Integer obj2 )
	{
		return obj2-obj1;
	}
}
