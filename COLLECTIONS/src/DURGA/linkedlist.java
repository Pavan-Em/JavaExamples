package DURGA;
import java.util.*;
public class linkedlist {
	public static void main(String[] args) {
		LinkedList o=new LinkedList();
		o.add(10);
		o.add(null);
		o.add("pavan");
		System.out.println(o);
		o.addFirst("me");//add object in first
		System.out.println(o);
		o.addLast("no");//add object in last
		o.add(20);
		System.out.println(o);
		//o.getFirst();
		System.out.println(o.getFirst());
		System.out.println(o.getLast());
		o.removeFirst();//
		o.removeLast();
		System.out.println(o);
	}
}
