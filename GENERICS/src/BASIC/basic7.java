package BASIC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class basic7 {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("pavan","seena"));
		print(list1);
		HashSet<String> set=new HashSet<String>(Arrays.asList("pavan","seena","bunk"));
		print(set);
		
	}
	public static <T extends Collection<String>>void print(T obj)
	{
		for(String itr:obj)
		{
			System.out.println(itr);
		}
	}
}
