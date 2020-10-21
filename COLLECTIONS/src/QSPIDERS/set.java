package QSPIDERS;
import java.util.*;
public class set implements Comparable<set> {
	String name;
	int id;
	double salary;
	
	public set(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		HashSet<set> emp=new HashSet<set>();
		emp.add(new set("pavan",2,60000));
		emp.add(new set("pavan",1,60000));
		System.out.println(emp);
		
		TreeSet<set> emp2=new TreeSet<set>(emp);
		System.out.println(emp2);
		
		HashSet<Integer>  num=new HashSet<Integer>(Arrays.asList(2,4,1,5));
		System.out.println(num);
	}
	
	public int compareTo(set obj)
	{
		return id-obj.id;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}
