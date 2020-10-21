package DOUBT;
import java.util.*;

import com.sun.source.tree.Tree;
public class sortarray {
	
	String name;
	
	public sortarray(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		
		
		
		sortarray[] obj= {new sortarray("pavan"),new sortarray("pavan"),new sortarray("kera")};
		System.out.println(Arrays.toString(obj));
		Arrays.sort(obj,new sortnum());
		System.out.println(Arrays.toString(obj));
		
		ArrayList<sortarray> obj2=new ArrayList<sortarray>(Arrays.asList(obj));
		System.out.println(obj2);
		Collections.sort(obj2, new sortnum());
		System.out.println(obj2);
		
		TreeMap<sortarray, Integer> obj3=new TreeMap<sortarray, Integer>(new sortnum());
		obj3.put(new sortarray("pavan"), 1);
		obj3.put(new sortarray("pavan"), 1);
		System.out.println(obj3);
		
		LinkedList<sortarray> obj4=new LinkedList<sortarray>(obj2);
		System.out.println(obj4);
		Collections.sort(obj4, new sortnum());
		System.out.println(obj4);
	}
	
	public String toString()
	{
		return name;
	}
}



class sortnum implements Comparator<sortarray>
{
	public int compare(sortarray obj1,sortarray obj2)
	{
		return obj1.name.compareTo(obj2.name);
	}
}
