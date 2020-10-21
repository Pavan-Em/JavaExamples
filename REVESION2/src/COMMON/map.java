package COMMON;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class map {
	public static void main(String[] args) {
		
		HashMap<Integer, String >  map1 = new HashMap<Integer, String>();
		map1.put(null, null);
		map1.put(1, "A");
		map1.put(null, "I");
		map1.put(3, "A");
		map1.put(5, "D");
		map1.put(4, "A");
		map1.put(2, "R");
		map1.putIfAbsent(10, "pavan");
		System.out.println(map1.getOrDefault(111, "hehe"));
		System.out.println(map1);
		
		Iterator<Map.Entry<Integer	, String>> itr = map1.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("=====================");
		
		for(Map.Entry<Integer, String> m : map1.entrySet())
		{
			System.out.println(m.getKey()+"    "+m.getValue());
		}
		
		System.out.println("=========================");
		
		map1.forEach((k,v)->System.out.println("Key : "+k+"  value : "+v));
	}
}
