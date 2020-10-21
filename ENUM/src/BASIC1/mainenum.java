package BASIC1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public enum mainenum {
	
;
	
	public static void main(String[] args)
	{
		
		System.out.println("je");
		
		System.out.println("======================");
		
		LinkedList<String> st=new LinkedList<String>(Arrays.asList("pavan","kera","anand","pavan"));
		System.out.println(st);
		Collections.sort(st,new nodup());
		System.out.println(st);
	}
	

}

class nodup implements Comparator<String>
{
	public int compare(String obj1,String obj2)
	{
		return 0;
	}
}
