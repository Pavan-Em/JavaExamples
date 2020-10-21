package QSPIDERS;
import java.util.*;
public class listtoarray {
	public static void main(String[] args) {
		String[] s= {"pavan","kera"};
		System.out.println(Arrays.toString(s));
		LinkedList<String> slist=new LinkedList<String>(Arrays.asList(s));
		System.out.println(slist);
		slist.add("jordan");
		slist.addFirst("pavi");
		System.out.println(slist);
		s=slist.toArray(new String[slist.size()]);
		System.out.println("s"+Arrays.toString(s));
		System.out.println("===========================");
		String[] s2=new String[slist.size()];
		s2=slist.toArray(s2);
		System.out.println("s2"+Arrays.toString(s2));
		System.out.println("=========================");
		Object[] s3=slist.toArray();
		
	}
}
