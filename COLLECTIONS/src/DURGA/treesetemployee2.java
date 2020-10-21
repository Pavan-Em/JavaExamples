package DURGA;
import java.util.*;
public class treesetemployee2 implements Comparable<treesetemployee2>{
	
	String name;
	int id;
	
	public treesetemployee2(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args)
	{
		TreeSet<treesetemployee2> set=new TreeSet<treesetemployee2>();
		set.add(new treesetemployee2("pavan", 3));
		set.add(new treesetemployee2("jordan", 2));
		set.add(new treesetemployee2("kera", 4));
		set.add(new treesetemployee2("pavi", 1));
		set.add(new treesetemployee2("abi", 2));
		System.out.println(set);
		System.out.println("==============");
		
	}
	
	public String toString()
	{
		return "[ "+id+","+name+" ]";
	}
	
	public int compareTo(treesetemployee2 obj)
	{
		if(id<obj.id)
			return -1;
		else if(id>obj.id)
			return 1;
		else
			return 0;
	}
}
