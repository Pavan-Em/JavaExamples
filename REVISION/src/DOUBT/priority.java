package DOUBT;
import java.util.*;
public class priority {
	String name;
	
	public priority(String name)
	{
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		PriorityQueue<priority> p=new PriorityQueue<priority>(10,new noduplecatenames());
		p.offer(new priority("pavan"));
		p.offer(new priority("pavan"));
		p.offer(new priority("kera"));
		System.out.println(p);
		
		TreeSet<priority> tree=new TreeSet<priority>(new noduplecatenames());
		for(priority pp:p)
		{
			tree.add(pp);
		}
		System.out.println(tree);
		p.clear();
		p=new PriorityQueue<priority>(tree);
		System.out.println(p);
		
		
	}
	
	public String toString()
	{
		return name;
	}
}


class noduplecatenames implements Comparator<priority>
{
	public int compare(priority obj1,priority obj2)
	{
		return obj1.name.compareTo(obj2.name);
	}
}