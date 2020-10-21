package QUEUE.DEQUE;
import java.util.*;
public class deque1 {
	public static void main(String[] args) {
		LinkedList<Integer> num=new LinkedList<Integer>(Arrays.asList(2,1,9,4,1,1));
		System.out.println(num);
		num.removeFirstOccurrence(2);
		ListIterator<Integer> itr=num.listIterator();
		while(itr.hasNext())
		{
			itr.next();
			itr.set(10);
		}
		System.out.println(num);
	}
}
