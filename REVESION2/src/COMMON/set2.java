package COMMON;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class set2 implements Comparable<set2>{
	int id ;
	String name ;
	
	public set2 (int id , String name)
	{
		this.id = id;
		this.name = name;
	}
	public static void main(String [] args) {
		set2[] info = { new set2(1,"A"),new set2(5,"C"),new set2(3,"E"),new set2(2,"D"),new set2(4,"B"),new set2(4,"B")};
		TreeSet<set2> info1 = new TreeSet<set2>(Arrays.asList(info));
		System.out.println(info1);
		System.out.println(info1.size());
		
		System.out.println("=================================");
		
		TreeSet<set2> info2 = new TreeSet<set2>(new MyComparetor1());
		info2.addAll(Arrays.asList(info));
		System.out.println(info2);
		NavigableSet<set2> n = info2.descendingSet();
		System.out.println(n);
		
	}
	public int compareTo(set2 obj)
	{
		//return id-obj.id;
		return -1;
	}
	
	
	public String toString()
	{
		return "("+id+","+name+")";
	}	
	
}


class MyComparetor1 implements Comparator<set2>
{
	public int compare(set2 obj1 , set2 obj2)
	{
		return obj1.name.compareTo(obj2.name);
	}
}
