package QUEUE.DEQUE;
import java.util.*;

public class arraydeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> num=new ArrayDeque<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(10);
		System.out.println(num);
		num.removeFirstOccurrence(10);
		System.out.println(num);
		
	}
}
