package QUEUE.PRIORITYQUEUE;
import java.util.*;
public class pq2 {
	
	String name;
	int id;
	
	public pq2(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public static void main(String[] args) {
		PriorityQueue<pq2> q=new PriorityQueue<pq2>(new heycomparetor());
		q.offer(new pq2("pavan",1));
		q.offer(new pq2("kera",2));
		q.offer(new pq2("pavan",1));
		System.out.println(q);
	}
	
	public String toString()
	{
		return "["+id+","+name+"]";
	}
}

class heycomparetor implements Comparator<pq2>
{
	public int compare(pq2 obj1,pq2 obj2)
	{
		return obj1.name.compareTo(obj2.name);
	}
}

