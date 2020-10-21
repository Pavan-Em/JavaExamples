package QSPIDERS.MAP;
import java.util.*;
public class methods {
	public static void main(String[] args) {
		HashMap<Integer,String> map1=new HashMap<Integer, String>();
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		
		//to add elements  //atomatically sorted based on key
		System.out.println("put(k,v)");
		map1.put(2, "kera");
		map1.put(3,"jordan");
		map1.put(4, "pavan");
		System.out.println("map1: "+map1);//Atomatically sorted
		map2.put(1, "mille");
		map2.put(5,"deek");
		System.out.println("map2: "+map2);
		System.out.println("====================================");
		
		//to putAll()   //autometically sorted based on key
		System.out.println("putAll(map)");
		System.out.println("Adding map2 to map1");
		map1.putAll(map2);
		System.out.println(map1);
		System.out.println("===================================");
		
		//while adding string its not sorting based on Alphabet
		System.out.println("Adding String");
		HashMap<String,String> map3=new HashMap<String, String>();
		map3.put("a", "a");
		map3.put("A", "A");
		System.out.println("map3: "+map3);
		System.out.println("====================================");
		
		//cpotainsKey(key) //give wteva you want just search for key if present TRUE else FALSE
		System.out.println("containsKey(key)");
		System.out.println("2 present in map1: "+map1.containsKey(2));
		System.out.println("6 present in map1: "+map1.containsKey(6));
		System.out.println("a present in map1: "+map1.containsKey("a"));
		System.out.println("=====================================");
		
		//containsVAlue(Value)  //give wteva you want just search for Value if present TRUE else FALSE
		System.out.println("containsValue(value)");
		System.out.println("pavan present in map1: "+map1.containsValue("pavan"));
		System.out.println("rudra present in map1: "+map1.containsValue("rudra"));
		System.out.println("44 present in map1: "+map1.containsValue(44));
		System.out.println("=====================================");
		
		//remove(key)  //it returns type of value  //if key is  not present returns Null
		System.out.println("remove(key)");
		String name=map1.remove(1);
		System.out.println("Removed name(1) is: "+name);
		String name2=map1.remove(10);
		System.out.println("Removed name(10) is: "+name2);
		System.out.println(map1);
		map1.put(1, "mille");
		System.out.println("======================================");
		
		//get(key) //it return type of key  //if key is not present returns Null
		System.out.println("get(key)");
		String name3=map1.get(4);
		System.out.println("Name present at 4: "+name3);
		String name4=map1.get(9);
		System.out.println("Name present at 9: "+name4);
		System.out.println("=======================================");
		
		//values()  //it returns the collections of values in the map
		System.out.println("values()");
		Collection<String> c=map1.values();
		System.out.println("Cpllection of values in map1: "+c);
		System.out.println("========================================");
		
		//keySet()  //return the set of keys in the map
		System.out.println("keySet()");
		Set<Integer> set=map1.keySet();
		System.out.println(set);
		System.out.println("=========================================");
		
		//entrySet()  //returns a set<<k,y>>
		System.out.println("entrySet()");
		Set a=map1.entrySet();//refer geeksforgeeks
		System.out.println(a);
		//fetching data using for each loop
		for(Object f:a)
		{
			System.out.println(f);
		}
		System.out.println("==========================================");
		
		//here comes the Mpa.entry<i> comcept
		Set<Map.Entry<Integer, String>> me=map1.entrySet();
		System.out.println(me);
		for(Map.Entry<Integer, String> me1:me)
		{
			System.out.println("Key:"+me1.getKey()+"  Value:"+me1.getValue());
			System.out.println("HashCode:"+me1.hashCode());
			System.out.println(me1.getValue().equals("pavan"));
			//me1.setValue("jai hanuman");
			
		}
		System.out.println(map1);
		System.out.println("============================================");
		
		System.out.println("Iterating Map");
		Iterator itr=map1.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\niterate using efor each loop");
		for(Object o:map1.entrySet())
		{
			System.out.println(o);
		}
		
		System.out.println("using values()");
		Iterator<String> s=map1.values().iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		System.out.println("\nusing keySet()");
		Iterator<Integer> i=map1.keySet().iterator();
		while(i.hasNext())
		{
			System.out.println(map1.get(i.next()));
		}
		
		System.out.println("=============================");
		for(String d:map1.values())
		{
			System.out.println(d);
		}
		for(Integer d:map1.keySet())
		{
			System.out.println(map1.get(d));
		}
		System.out.println(map1);
		System.out.println("=========================");
		map1.forEach((k,v)->System.out.println("key:"+k+"value:"+v));
		
	}//End of Main
}
























