package DOUBT;
import java.util.*;
public class hashsetdoubt {

	public static void main(String[] args) {
		HashSet<Integer> num=new HashSet<Integer>();
		num.add(null);
		num.add(null);
		System.out.println(num);
		
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(10);
		tree.add(60);
		tree.add(60);
		tree.add(39);
		System.out.println(tree);
		
		NavigableSet<Integer> n=tree.descendingSet();
		System.out.println(n);
		
		TreeSet<Integer> num2=new TreeSet<Integer>(new heycomparetors());
		num2.add(null);
		num2.add(null);
		System.out.println(num2);
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(1, "pavan");
		map.put(2, "kera");
		System.out.println(map);
		map.putIfAbsent(2, "pavi");
		System.out.println(map);
		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(2);
		list1.add(3);
		
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(9);
		
		Collections.copy(list1, list2);
		System.out.println(list1);
		
		for(Integer m:list2)
		{
			list1.add(m);
		}
		System.out.println(list1);
		
	}
}

class heycomparetors implements Comparator<Integer>
{
	public int compare(Integer obj1,Integer obj2)
	{
		return -1;
	}
}
