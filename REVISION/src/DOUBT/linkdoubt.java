package DOUBT;
import java.util.*;
public class linkdoubt {

	public static void main(String[] args) {
		LinkedList<String> st=new LinkedList<String>(Arrays.asList("pavan","kera","mille"));
		ListIterator<String> itr=st.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.add("lowde");
		}
		System.out.println(st);
		
		System.out.println("=================");
		
		TreeSet set=new TreeSet();
		set.add(10);
		set.add("je");
		System.out.println(set);
	}
}
