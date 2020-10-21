package DURGA;
import java.util.*;
public class treesetdoubt {
	public static void main(String[] args) {
		TreeSet<Integer> num=new TreeSet<Integer>(new heyman());
		num.add(10);
		num.add(1);
		num.add(50);
		num.add(30);
		num.add(1);
		System.out.println(num);
		
		
		SortedSet<Integer> ss=new TreeSet<Integer>();
		ss.add(10);
		ss.add(1);
		ss.add(50);
		ss.add(30);
		ss.add(1);
		System.out.println(ss);
		SortedSet<Integer> ss2=ss.subSet(1, 30);
		System.out.println(ss2);
		System.out.println(ss.first());
		System.out.println(ss.headSet(1));
	}
	
	
}

class heyman implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		return i2-i1;
	}
}
