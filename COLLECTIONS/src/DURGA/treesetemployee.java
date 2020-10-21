package DURGA;
import java.util.*;
public class treesetemployee {
	String name;
	int id;
	
	public treesetemployee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		TreeSet<treesetemployee> set=new TreeSet<treesetemployee>(new heycpmparator());
		set.add(new treesetemployee("pavan", 1));
		set.add(new treesetemployee("jordan", 2));
		set.add(new treesetemployee("pavan", 3));
		System.out.println(set);
		
		//to access set only by fro each or iterator
		for(treesetemployee e:set)
		{
			if(2==e.id)
				System.out.println(e.name);
		}
		for(treesetemployee e:set)
		{
			if("pavan".equals(e.name))
				System.out.println(e);
		}
	}
	
	public String toString() {
		return "["+id+","+name+"]";
	}
}

class heycpmparator implements Comparator<treesetemployee>
{
	public int compare(treesetemployee o1,treesetemployee o2)
	{
		int i=o1.name.compareTo(o2.name);
		if(i==0)
			return 1;
		return i;
	}
}
