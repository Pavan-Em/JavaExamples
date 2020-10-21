package DURGA;
import java.util.*;
public class sorthashset  {
	int id;
	
	public sorthashset(int id)
	{
		this.id=id;
	}
	public static void main(String[] args) {
		HashSet<sorthashset> set=new HashSet<sorthashset>();
		set . add (new sorthashset(10) );
		set . add (new sorthashset (2) );
		set . add (new sorthashset (99) );
		set . add (new sorthashset (65) );
		set . add (new sorthashset (90) );
		System.out.println(set);
		ArrayList<sorthashset> ar=new ArrayList<sorthashset>(set);
		System.out.println(ar);
		Collections.sort(ar,new hey());
		System.out.println(ar);
		set=new HashSet<sorthashset>(ar);
		System.out.println(set);
	}
	
	
	
	public String toString()
	{
		return ""+id;
	}
	
}
class hey implements Comparator<sorthashset>
{
	public int compare(sorthashset s1,sorthashset s2)
	{
		return s1.id-s2.id;
	}
}


