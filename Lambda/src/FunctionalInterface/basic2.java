package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class basic2 {
	public static void main(String[] args) {
		
		Thread t = new Thread(()->
		 {
			for(int i=0 ;i<10 ;i++)
			{
				System.out.println("Child Thread");
			}
		});
		t.start();
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(65);
		list.add(41);
		list.add(98);
		list.add(10);
		list.add(0);
		list.add(46);
		list.add(65);
		System.out.println(list);
		Comparator<Integer> c = (obj1,obj2)->obj1-obj2;
		Collections.sort(list,c);
		System.out.println(list);
		
		
	}
}
