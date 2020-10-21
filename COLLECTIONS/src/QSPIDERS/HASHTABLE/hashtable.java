package QSPIDERS.HASHTABLE;
import java.util.*;
public class hashtable {
	int i;
	
	public hashtable(int i)
	{
		this.i=i;
	}
	
	public static void main(String[] args) {
		Hashtable<hashtable,String> h=new Hashtable<hashtable, String>();
		h.put(new hashtable(5), "u");
		h.put(new hashtable(2), "u");
		h.put(new hashtable(6), "u");
		h.put(new hashtable(15), "u");
		h.put(new hashtable(23), "u");
		h.put(new hashtable(16), "u");
		System.out.println(h);
		
		System.out.println("===================================");
		
		HashMap<hashtable,String> tree=new HashMap<hashtable, String>(h);
		System.out.println(tree);
		//System.out.println(h.entrySet());
	}
	
	public String toString()
	{
		return i+"";
	}
	
	public int hashCode()
	{
		return i;
	}
	

}
