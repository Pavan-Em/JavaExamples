package set;
import java.util.*;
public class hashset {
	String name;
	
	public hashset(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(1);
		set.add(1);
		set.add(10);
		set.add(5);
		System.out.println(set);
		
		ArrayList list=new ArrayList(set);//converting set to list
		System.out.println(list);
		
		HashSet<hashset> obj=new HashSet<hashset>();
		obj.add(new hashset("rudra"));
		obj.add(new hashset("badra"));
		obj.add(new hashset("gowda"));
		obj.add(new hashset("bunkseena"));
		obj.add(new hashset("bottseena"));
		
		Iterator<hashset> itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}
	
	public String toString()
	{
		return name;
	}
}
