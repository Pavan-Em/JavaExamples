package DURGA;
import java.util.*;
public class treeset {
	public static void main(String[] args) 
	{
		TreeSet<String> set=new TreeSet<String>(new heycomparetor());
		set.add("A");
		set.add("aa");
		set.add("AA");
		set.add("AA");
		System.out.println(set);
		}
}
class heycomparetor implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		int l=s1.length()-s2.length();
		if(l>0)
			return 1;
		else if(l<0)
			return -1;
		else 
			return s1.compareTo(s2);
		
	}
}
