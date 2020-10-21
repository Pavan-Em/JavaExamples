package START;
import java.util.*;
public class basic {
	public static void main(String[] args) {
		PriorityQueue<Integer> num=new PriorityQueue<Integer>();
		num.offer(10);
		num.add(5);
		num.add(3);
		num.offer(8);
		System.out.println(num);
		
		System.out.println(num.poll());
		System.out.println(num.peek());
		System.out.println(num.element());
		System.out.println(num.remove());
		System.out.println(num);
		System.out.println(num.remove(8));
		System.out.println(num);
		System.out.println(num.poll());
		System.out.println(num.poll());
		try
		{
			num.remove();
		}
		catch(Exception e)
		{
			System.out.println("No element int the Queue");
		}
		try
		{
			num.element();
		}
		catch(Exception e)
		{
			System.out.println("No Element in the Queqe");
		}
		System.out.println("====================");
		PriorityQueue<String> st=new PriorityQueue<String>();
		st.offer("Pavan");
		st.add("Anand");
		st.add("Kera");
		System.out.println(st);
	}
}


