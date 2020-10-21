package QSPIDERS;
import java.util.*;
public class treeset {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(20);
		set.add(5);
		System.out.println(set);
		TreeSet set1=null;
		
		NavigableSet n=set.descendingSet();
		System.out.println(n);
		
		HashSet s=new HashSet();
		s.add(10);
		s.add(60);
		s.add(30);
		s.add(9);
		System.out.println(s);
		//Collections.sort(s);
	}
}
