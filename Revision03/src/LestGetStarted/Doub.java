package LestGetStarted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Doub {

	public static void main(String[] args) {
		Integer s = new Integer(10);
		System.out.println(s);
		int ss =10;
		System.out.println(s==ss);
		
		Map<Integer,String> mao = new HashMap<Integer, String>();
		
		int num = new Integer(10);
		
		s.intValue();
		
		double d1 = Double.parseDouble("4");
		System.out.println(d1);
		
		Double d2 = 10.32;
		int num1 = d2.intValue();
		System.out.println(num1);
		
	}
}
