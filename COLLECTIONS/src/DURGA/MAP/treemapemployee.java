package DURGA.MAP;
import java.util.*;
public class treemapemployee  implements Comparable<treemapemployee>{
	
	String name;
	int id;
	double salary;
	
	public treemapemployee( String name , int id , double salary )
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) 
	{
		TreeMap<treemapemployee , String> map=new TreeMap<treemapemployee , String>();
		map.put(new treemapemployee("Pavi" , 2 , 20000) , "A+");
		map.put(new treemapemployee("Kera" , 3 , 60000) , "A-");
		map.put(new treemapemployee("Jordan" , 5 , 40000) , "B+");
		map.put(new treemapemployee("Mille" , 1 , 75000) , "O+");
		map.put(new treemapemployee("Deeks" , 4 , 90000) , "AB+");
		map.put(new treemapemployee("Gowda" , 6 , 20000) , "A+");
		System.out.println( map );
		map.forEach((k,v)->System.out.println(k.name));
		System.out.println("===============================================");
		TreeMap<treemapemployee , String> map1=new TreeMap<treemapemployee , String>(new heycomparetor());
		map1.put(new treemapemployee("Pavi" , 2 , 20000) , "A+");
		map1.put(new treemapemployee("Kera" , 3 , 60000) , "A-");
		map1.put(new treemapemployee("Jordan" , 5 , 40000) , "B+");
		map1.put(new treemapemployee("Mille" , 1 , 75000) , "O+");
		map1.put(new treemapemployee("Deeks" , 4 , 90000) , "AB+");
		map1.put(new treemapemployee("Mille" , 6 , 20000) , "A+");
		System.out.println( map1 );
	}
	
	public String toString()
	{
		return "[ "+id+" , "+name+" , "+salary+" ]";
	}
	
	//very easy to sort using key
	public int compareTo( treemapemployee obj )
	{
		if(name.equals(obj.name))//this logic used to preserve insertion order and remove duplicate name
			return 0;
		return 1;
	}
}

class heycomparetor implements Comparator<treemapemployee>
{
	public int compare(treemapemployee obj1,treemapemployee obj2)
	{
		//return (int)obj1.salary-(int)obj2.salary;
		return 1;
	}
}
