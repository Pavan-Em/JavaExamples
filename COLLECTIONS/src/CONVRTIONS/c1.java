package CONVRTIONS;
import java.util.*;
public class c1 implements Comparable<c1>{
	
	String name;
	int id;
	
	public c1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public static void main(String[] args) {
		TreeMap<c1, String> map=new TreeMap<c1, String>();
		map.put(new c1("pavi",2), "mgiri");
		map.put(new c1("kera",4), "sira");
		map.put(new c1("mille",1), "koratgere");
		map.put(new c1("jordan",3), "gulbarga");
		map.forEach((k,v)->System.out.println(k));
		System.out.println(map);
		System.out.println("----------------------------------------------");
		System.out.println("coverting keys and values into arrays separately");
		
		c1[] info=new c1[map.size()];//Array info
		info=map.keySet().toArray(info);
		System.out.println(Arrays.toString(info)+"-->Array of type classname");
		
		String[] oor=map.values().toArray(new String[map.size()]);
		//oor[0]="hey";
	//	System.out.println(Arrays.toString(oor));
		oor=map.values().toArray(oor); //it repalce hey inside array and print wteva thr values     
		System.out.println(Arrays.toString(oor)+"-->Array of type String");
		System.out.println("----------------------------------------------");
		
		System.out.println("converting Array into LIST and SET");
		List<c1> list=new LinkedList<c1>(Arrays.asList(info));
		System.out.println("Array to List of type classname-->"+list);
		Set<c1> set1=new TreeSet<c1>(Arrays.asList(info));
		System.out.println("Array to TreeSet of type classname-->"+set1);
		Set<c1> set2=new HashSet<c1>(Arrays.asList(info));
		System.out.println("Array to HashSet of type classname-->"+set2);
		System.out.println("---------------------------------------------");
		
		System.out.println("Converting Array to Map Separately");
		TreeMap<c1,String> map2=new TreeMap<c1, String>(new heycomparetor());
		for(int i=0;i<info.length;i++)
		{
			map2.put(info[i], oor[i]);
		}
		System.out.println(map2);
		
	}
	
	public int compareTo(c1 obj)
	{
		return id-obj.id;
	}
	
	public String toString()
	{
		return "["+id+","+name+"]";
	}
}

class heycomparetor implements Comparator<c1>
{
	public int compare(c1 obj1,c1 obj2)
	{
		return obj1.name.compareTo(obj2.name);
	}
}






















