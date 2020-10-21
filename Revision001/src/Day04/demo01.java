package Day04;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class demo01 implements Comparable<demo01>{

	String name;
	public demo01(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new SortMe());
		set.add("pavann");
		set.add("abi");
		set.add("tools");
		System.out.println(set);
		
		TreeSet<demo01> set1 = new TreeSet<demo01>();
		set1.add(new demo01("pavan"));
		set1.add(new demo01("abi"));
		System.out.println(set1);
		
	}
	
	public String toString()
	{
		return name;
	}
	@Override
	public int compareTo(demo01 o) {
		
		return name.compareTo(o.name);
	}
	

}

class SortMe implements Comparator<String>
{
	public int compare(String o1,String o2)
	{
		if(o1.length()<o2.length())
			return -1;
		else if(o1.length()>o2.length())
			return 1;
		else
			return o1.compareTo(o2);
	}
}
