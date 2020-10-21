package QSPIDERS.MAP;
import java.util.*;
public class treemap {
	public static void main(String[] args) {
		TreeMap<String , Integer> tree=new TreeMap<String, Integer>(new heycomparetor());
		tree.put("pavan", 1);
		tree.put("pavan",1);
		System.out.println(tree);
	}
}

class heycomparetor implements Comparator<String>
{
	public int compare(String obj1,String obj2)
	{
		return 1;
	}
}
