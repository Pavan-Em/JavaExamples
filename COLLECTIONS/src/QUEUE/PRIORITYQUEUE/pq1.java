package QUEUE.PRIORITYQUEUE;
import java.util.*;
public class pq1 {
	public static void main(String[] args) {
		PriorityQueue<String> q=new noduplicate<String>();
		q.offer("pavan");
		q.offer("pavan");
		q.offer("pavan");
		q.offer("kera");
		System.out.println(q);
		
	}
}


class noduplicate<E> extends PriorityQueue<E>//or just add everthing in hashset then converted to queue
{
	public boolean offer(E e)
	{
		boolean isAdded=false;
		if(!super.contains(e))
		{
			isAdded=super.offer(e);
		}
		return isAdded;
	}
}
