package DOUBT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class arrayduplicateremover {
	
	public static void main(String[] args) {
	ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(1,1,6,4,2));
	System.out.println(num);
	Collections.sort(num, new noduplicte());
	System.out.println(num);
	System.out.println("===========================");
	LinkedList<Integer> num2=new LinkedList<Integer>(num);
	System.out.println(num);
	Collections.sort(num2, new noduplicte());
	System.out.println(num2);
	
	}
	

}

class noduplicte implements Comparator<Integer>
{
	public int compare(Integer obj1,Integer obj2)
	{
		return obj1-obj2;
	}
}
