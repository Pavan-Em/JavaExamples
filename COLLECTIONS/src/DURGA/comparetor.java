package DURGA;
import java.util.*;
public class comparetor {
	String name;
	
	public comparetor(String name)
	{
		this.name=name;
	}
	
	public static void main(String[] args) {
		ArrayList<comparetor> list=new ArrayList<comparetor>();
		list.add(new comparetor("pavan"));
		list.add(new comparetor("kera"));
		list.add(new comparetor("smith"));
		list.add(new comparetor("jordan"));
		list.add(new comparetor("1"));
		
		System.out.println(list);
		
		Collections.sort(list,new ascending());
		System.out.println(list);
		
		Collections.sort(list,new descinding());
		System.out.println(list);
		
		System.out.println("==========================");
		TreeSet<String>  tree2=new TreeSet<String>();
		tree2.add("anand");
		tree2.add("pavan");
		tree2.add("jordan");
		System.out.println(tree2);
		Comparator c1=tree2.comparator();
		System.out.println(c1);
		TreeSet<String>  tree=new TreeSet<>(new stringc());
		tree.add("anand");
		tree.add("pavan");
		tree.add("jordan");
		System.out.println(tree);
		Comparator c=tree.comparator();
		System.out.println(c);
		
		System.out.println("=========================");
		System.out.println("Sorting HashSet\n");
		HashSet<Integer> num=new HashSet<>(Arrays.asList(1,9,90,99,50,59));
		System.out.println(num);
		TreeSet<Integer> inum=new TreeSet<>(num);
		System.out.println(inum);
		
		
	}
	
	public String toString()
	{
		return name;
	}
}
//sorting by ascending order
class ascending implements Comparator<comparetor>
{
	public int compare(comparetor c1,comparetor c2)
	{
		return c1.name.compareTo(c2.name);
	}
}

//sording by descinding order
class descinding implements Comparator<comparetor>
{
	public int compare(comparetor c1,comparetor c2)
	{
		return c2.name.compareTo(c1.name);
	}
}

//sorting treset by descinding order
class stringc implements Comparator<String>
{
	public int compare(String c1,String c2)
	{
		return c2.compareTo(c1);
	}
}

