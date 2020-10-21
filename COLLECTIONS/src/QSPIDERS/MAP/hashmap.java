package QSPIDERS.MAP;
import java.util.*;
public class hashmap {
	String name;
	int id;
	public hashmap(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		 HashMap<hashmap,Integer> obj=new HashMap<hashmap, Integer>();
		 obj.put(new hashmap("pavan",1), 20);
		 obj.put(new hashmap("kera", 0),0);
		 System.out.println(obj);
		 
		 HashMap map2=new HashMap();
		 map2.put(1, "pavan");
		 map2.put("pavan",1);
		 map2.put(new hashmap("pavan",1),5);
		 System.out.println(map2);
	}
	
	public String toString()
	{
		return name+" "+id;
	}
}
