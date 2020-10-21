package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;

public class basic3 {
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Pavan", 4);
		Employee e2 = new Employee("Tools", 2);
		Employee e3 = new Employee("Seena", 3);
		Employee e4 = new Employee("Manja", 1);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println(list);
		
		
		Collections.sort(list, (obj1,obj2)->obj1.id-obj2.id);
		
		System.out.println(list);
	}
}

class Employee
{
	String name;
	int id;
	
	public Employee(String name , int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return "("+id+","+name+")";
	}
}
