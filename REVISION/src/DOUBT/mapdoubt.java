package DOUBT;
import java.util.*;
public class mapdoubt {
	
	String name;
	
	public mapdoubt(String name)
	{
		this.name=name;
	}

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree=new TreeMap<Integer, String>();
		tree.put(2, "pavan");
		tree.put(6, "kera");
		tree.put(1,"chombu");
		System.out.println(tree);
		System.out.println(tree.getOrDefault(10, "hehehe"));
		
		TreeMap<Integer, mapdoubt> tree1=new TreeMap<Integer, mapdoubt>();
		mapdoubt obj=new mapdoubt("pavan");
		tree1.put(2, obj);
		tree1.put(6, new mapdoubt("kera"));
		tree1.put(1,new mapdoubt("chombu"));
		System.out.println(tree1);
		System.out.println(tree1.containsValue(obj));
		
		tree1.forEach((key,value)->System.out.println("Key:"+key+" "+"value:"+value));
		System.out.println("===========================");
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(null,null);
		map.put(null, "pavan");
		System.out.println(map);
		
	}
	
	public String toString()
	{
		return name;
	}
}
