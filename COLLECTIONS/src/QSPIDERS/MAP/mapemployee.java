package QSPIDERS.MAP;
import java.util.*;
public class mapemployee {
	String name;
	int id;
	double salary;
	
	public mapemployee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public static void main(String[] args) {
		HashMap<Integer,mapemployee> map=new HashMap<Integer, mapemployee>();
		map.put(1, new mapemployee("Pavan", 1, 45000));
		map.put(3, new mapemployee("Pavi", 3, 25000));
		map.put(5, new mapemployee("Kera", 5, 40000));
		map.put(2, new mapemployee("Jordan", 2, 90000));
		map.put(4, new mapemployee("Mille", 4, 75000));
		System.out.println("List of Employee");
		map.forEach((k,v)->System.out.println(k+"->"+v));
		
		//search emp info using name
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter name to Search:");
		String n=s.nextLine().trim();
		for(Map.Entry<Integer, mapemployee> m:map.entrySet())
		{
			if(n.equals(m.getValue().name))
				System.out.println(m.getValue());
		}
		
		//search by id
		System.out.print("\nEnter id to Search:");
		int num=s.nextInt();
		s.nextLine();
		for(Integer i:map.keySet())
		{
			if(num==i)
				System.out.println(map.get(i));
		}
		
		//search by salary range
		System.out.println("\nEnter Salary Range");
		System.out.print("From:");
		double num1=s.nextDouble();
		System.out.print("To:");
		double num2=s.nextDouble();
		for(Map.Entry<Integer, mapemployee> mm:map.entrySet())
		{
			if(mm.getValue().salary>=num1 && mm.getValue().salary<=num2)
			{
				System.out.println(mm.getValue());
			mm.getValue().name="savkara";
			}
		}
		System.out.println(map);
	}//main end
	
	public String toString()
	{
		return "["+id+","+name+","+salary+" Rs]";
	}
}
