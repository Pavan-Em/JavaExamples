package QUEUE.PRIORITYQUEUE;
import java.util.*;
public class pq3 {
	public static void main(String[] args) {
		PriorityQueue<Integer> num=new PriorityQueue<Integer>();
		for(int i=0;i<=10;i++)
		{
			num.offer(i);
		}
		System.out.println(num);
		System.out.println(num.poll());
		System.out.println(num);
		
	}
}
