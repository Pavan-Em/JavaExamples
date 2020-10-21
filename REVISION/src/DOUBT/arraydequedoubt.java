package DOUBT;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
public class arraydequedoubt {

	public static void main(String[] args) throws InterruptedException{
		ArrayBlockingQueue<Integer>num=new ArrayBlockingQueue<Integer>(2);
		System.out.println(num.offer(1));
		System.out.println(num.offer(2));
		System.out.println(num);
		System.out.println(num.offer(3));
		System.out.println(num);
		
		NavigableSet<Integer> num2=new TreeSet<Integer>();
		num2.add(1);
		num2.add(2);
		System.out.println(num2);
		NavigableSet<Integer> n=num2.descendingSet();
		System.out.println(n);
		
		
	}
}
