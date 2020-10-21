package COMMON;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class map2 {
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "A");
		map.put(6, "W");
		map.put(10, "D");
		map.put(7, "B");
		map.put(11, "E");
		map.put(9, "C");
		map.put(14, "P");

		System.out.println(map);

		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(map.entrySet());
		System.out.println(list);
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> obj1, Map.Entry<Integer, String> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		System.out.println(list);
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		for (Map.Entry<Integer, String> m : list) {
			lmap.put(m.getKey(), m.getValue());
		}
		System.out.println(lmap);

	}
}
