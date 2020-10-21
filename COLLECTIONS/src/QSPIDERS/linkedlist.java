package QSPIDERS;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>(Arrays.asList(1,4,5,6,7,2,3));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
