package QUEUE.BBLOCKINGQUEUE;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
public class arrayblockingqueue {
	public static void main(String[] args) throws InterruptedException{
		BlockingQueue<Integer> num=new ArrayBlockingQueue<Integer>(5);
		num.add(1);
		num.add(5);
		num.add(3);
		num.add(3);
		num.add(5);
		System.out.println(num.offer(6));
		num.put(5);
		//num.add(8);
	//	num.offer(9,10,TimeUnit.SECONDS);
		num.remove();
		num.take();
	//	num.offer(9,10,TimeUnit.SECONDS);
		System.out.println(num);
		
		BlockingQueue<Integer> num2=new LinkedBlockingQueue<Integer>();
		for(int i=0;i<101;i++)
		{
			num2.put(i);
		}
		System.out.println(num2);
		
		
	}
}
