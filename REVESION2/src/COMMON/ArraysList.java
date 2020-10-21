package COMMON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,3,1));
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 1));
		Collections.sort(list,new Mycomparetor());
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 1));
		System.out.println(Collections.binarySearch(list, 1, new Mycomparetor()));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.clear();
	}
}

class Mycomparetor implements Comparator<Integer>
{
	public int compare(Integer o1 , Integer o2)
	{
		return o2-o1;
	}
}
