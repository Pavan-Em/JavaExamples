package DURGA;
import java.util.*;
public class listiterator {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Stack s=new Stack();
		
	}
}
