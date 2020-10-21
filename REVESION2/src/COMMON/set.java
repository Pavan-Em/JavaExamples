package COMMON;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;

public class set {
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add(null);
		set.add(1);
		set.add(null);
		set.add("pavan");
		System.out.println(set);
		
		System.out.println("=================================");
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(null);
		set1.add(2);
		set1.add(1);
		set1.add(5);
		set1.add(3);
		set1.add(4);
		set1.add(1);
		System.out.println(set1);  
		
		System.out.println("=======================================");
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(null);
		set2.add(2);
		set2.add(1);
		set2.add(5);
		set2.add(3);
		set2.add(4);
		set2.add(1);
		System.out.println(set2);  

		
	}
}
