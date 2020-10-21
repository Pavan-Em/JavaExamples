package DURGA.MAP;
import java.util.*;
public class map1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map1=new HashMap<Integer, String>();
		String s=map1.put(1,"pavan");
		System.out.println(s);
		System.out.println(map1);
		System.out.println(map1.put(0,"kera"));
		System.out.println(map1);
		System.out.println(map1.put(1, "jordi"));
		System.out.println("===============================");
		
		HashMap map2=new HashMap();
		map2.put("pavan",1);
		map2.put(1, "kera");
		System.out.println(map2);
		
		System.out.println("=====================");
		
		HashMap<Integer,String> map3=new HashMap<Integer, String>();
		for(int i=1;i<=100;i++)
		{
			map3.put(i, "pavan");
		}
		
		for(Map.Entry<Integer, String> me:map3.entrySet())
		{
			System.out.println(me);
		}
		
		LinkedHashMap<Integer, String> map4=new LinkedHashMap<Integer, String>();
		map4.put(2, "pavan");
		map4.put(1, "kera");
		System.out.println(map4);
	}
}
