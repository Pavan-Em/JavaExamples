package DURGA.MAP;
import java.util.*;
public class doubtmap   {
	String name;
	
	public doubtmap(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		HashMap<doubtmap,Integer> tree=new HashMap<doubtmap, Integer>();
		tree.put(new doubtmap("pavan"), 1);
		tree.put(new doubtmap("pavan"), 1);
		tree.put(new doubtmap("pavan"), 1);
		tree.put(new doubtmap("pavan"), 1);
		tree.put(new doubtmap("pavan"), 1);
		System.out.println(tree);
		
		HashMap<String,Integer> tree2=new HashMap<String, Integer>();
		tree2.put("pavan", 1);
		tree2.put("pavan", 2);
		System.out.println(tree2);
		
	}
	
	/*public int compareTo(doubtmap obj)
	{
		return 1;
	}*/
	
	public String toString()
	{
		return name;
	}
}
