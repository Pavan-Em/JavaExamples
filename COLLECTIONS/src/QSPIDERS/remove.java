package QSPIDERS;
import java.util.*;
public class remove {
	
	int id;
	String name;
	
	public remove(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		ArrayList r=new ArrayList(Arrays.asList(1,2,3,4,5,6,4,5));
		ArrayList rr=new ArrayList(Arrays.asList(4,5));
		r.remove((Integer)3);
		System.out.println(r);
		System.out.println(r.remove(2));
		System.out.println(r);
		r.removeAll(rr);
		System.out.println(r);
		
		System.out.println("===========================");
		ArrayList<Integer> i=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(i);
		i.removeIf(n->(n%2!=0));
		System.out.println(i);
		
		System.out.println("=======================");
		ArrayList<remove> obj=new ArrayList<>(Arrays.asList(new remove("pavan",1),new remove("jordan",2),new remove("rudra",3)));
		System.out.println(obj);
		obj.removeIf(n->(n.name.equals("pavan")|n.name.equals("rudra")));
		System.out.println(obj);
		//System.out.println((Integer)1==1);
	}
	
	public String toString()
	{
		return "("+id+","+name+")";
	}
}
