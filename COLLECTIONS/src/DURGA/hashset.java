package DURGA;
import java.util.*;
public class hashset {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(10);
		s.add("pavan");
		s.add('a');
		s.add("a");
		s.add(90);
		s.add(null);
		s.add(60);
		System.out.println(s);
		
		System.out.println("============================");
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(10);
		ls.add("pavan");
		ls.add('a');
		ls.add("a");
		ls.add(90);
		ls.add(null);
		ls.add(60);
		System.out.println(ls);
		
		System.out.println("=========================");
		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,1,2,3,null));
		System.out.println(list);
		HashSet<Integer> set=new HashSet<Integer>(list);
		System.out.println(set);
		ArrayList<Integer> list2=new ArrayList<Integer>(set);
		System.out.println(list2);
	}
}
