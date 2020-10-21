package DOUBT;

import java.util.Arrays;
import java.util.Comparator;

public class arraylist {

	public static void main(String[] args) {
		
	int[] num= {1,5,2,9,4};
	Integer[] num2=new Integer[num.length];
	for(int i=0;i<num.length;i++)
	{
		num2[i]=num[i];
	}
	System.out.println(Arrays.toString(num2));
	Arrays.sort(num2,new pavan());
	System.out.println(Arrays.toString(num2));
	}
}


class pavan implements Comparator<Integer>
{
	public int compare(Integer obj1,Integer obj2)
	{
		return obj2-obj1;
	}
}
