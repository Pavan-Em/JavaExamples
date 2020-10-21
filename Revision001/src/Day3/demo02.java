package Day3;

import java.util.Arrays;
import java.util.Comparator;

public class demo02 implements Comparable<demo02>{

	String name;
	int id;
	
	public demo02(String name , int id)
	{
		this.name = name;
		this.id=id;
	}
	public static void main(String[] args) {
		
		demo02[] obj = new demo02[3];
		obj[0]=new demo02("pavan",2);
		obj[1]=new demo02("abi",3);
		obj[2]=new demo02("zoe",1);
		for(demo02 object:obj)
		{
			System.out.println(object);
		}
		System.out.println("===================================");
		Arrays.sort(obj);
		
		for(demo02 object:obj)
		{
			System.out.println(object);
		}
		System.out.println("===================================");
		Arrays.sort(obj,new sortId());
		for(demo02 object:obj)
		{
			System.out.println(object);
		}
	}
	
	public String toString()
	{
		return "["+id+","+name+"]";
	}
	
	public int compareTo(demo02 o)
	{
		return name.compareTo(o.name);
	}
	
}

class sortId implements Comparator<demo02>
{
	public int compare(demo02 o1 , demo02 o2)
	{
		return o1.id-o2.id;
	}
}
