package DOUBT;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class arraysortdoubt implements Comparable<arraysortdoubt>{
	String name;
	int id;
	
	public arraysortdoubt(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public static void main(String[] args) {
		
		arraysortdoubt[] obj=new arraysortdoubt[3];
		obj[0]=new arraysortdoubt("pavan",1);
		obj[1]=new arraysortdoubt("zebra",3);
		obj[2]=new arraysortdoubt("anand",2);
		
		System.out.println(Arrays.toString(obj));
		
		Arrays.sort(obj,Collections.reverseOrder());
		System.out.println(Arrays.toString(obj));
	}
	
	public int compareTo(arraysortdoubt obj)
	{
		return name.compareTo(obj.name);
	}
	
	public String toString()
	{
		return name+","+id;
	}
}

 class heycomparetorr implements Comparator<arraysortdoubt>
{
	public int compare(arraysortdoubt obj1,arraysortdoubt obj2)
	{
		
		return obj1.id-obj2.id;
	}
}



















