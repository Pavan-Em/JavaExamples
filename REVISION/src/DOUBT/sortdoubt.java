package DOUBT;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class sortdoubt implements Comparable<sortdoubt>{
	
	String name;
	int id;
	
	public sortdoubt(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public static void main(String[] args) {
		List<sortdoubt> list=new LinkedList<sortdoubt>();
		list.add(new sortdoubt("pavan", 4));
		list.add(new sortdoubt("kera", 2));
		list.add(new sortdoubt("anand", 3));
		list.add(new sortdoubt("mille", 1));
		System.out.println(list);
		System.out.println("=====================================");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println("=====================================");
		/*Collections.sort(list,new heycomparetor());
		System.out.println(list);*/
		//System.out.println("====================================");
		list.sort(new heycomparetor());
		System.out.println(list);
	}
	
	public int compareTo(sortdoubt obj)
	{
		return name.compareTo(obj.name);
	}
	
	public String toString()
	{
		return "["+id+","+name+"]";
	}
}

class heycomparetor implements Comparator<sortdoubt>
{
	public int compare(sortdoubt obj1,sortdoubt obj2)
	{
		return obj1.id-obj2.id;
	}
}



















