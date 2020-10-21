package Day04;

import java.util.HashMap;

public class demo02 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		map.put(i1, "PAVAN");
		System.out.println(map);
		map.put(i2, "pavan");
		System.out.println(map);
		map.put(20, "tools");
		System.out.println(map);
	}
}
