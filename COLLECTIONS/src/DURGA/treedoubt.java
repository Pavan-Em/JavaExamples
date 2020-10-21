package DURGA;
import java.util.*;
public class treedoubt {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(10);
		//set.add('a');
		//set.add("pav");
		System.out.println(set);
		
		System.out.println("====================");
		LinkedList<String> list=new LinkedList<String>(Arrays.asList("pavan","kera"));
		ListIterator<String> itr=list.listIterator();
		System.out.println(itr.nextIndex());
		System.out.println(itr.next());
		System.out.println(itr.nextIndex());
		System.out.println(itr.next());
		System.out.println(itr.previousIndex());
		//System.out.println(itr.next());
		
		System.out.println("===============================");
		Vector<String > v=new Vector<String>(Arrays.asList("pavan","pavi"));
		
		System.out.println("===========================");
		Stack<String> st=new Stack<String>();
		String stn=st.push("pavan");
		System.out.println(stn);
		
		List<String> a=list.subList(0, 2);
		System.out.println(a);
				
		
		HashMap < Integer , String > map1 = new HashMap < Integer , String > ();
		map1.put ( 1 , "pavan" );
		map1.put(2,"kera");
		System.out.println("map1:"+map1);
		HashMap<Integer,String> map2=new HashMap<Integer, String>();
		map2.put(1, "jordan");
		map2.put(2, "mille");
		map2.put(10, "deeka");
		System.out.println("map2:"+map2);
		for(Map.Entry<Integer, String> m:map2.entrySet())
		{
			int num=map1.size();
			if(m.getKey()<num+1)
				map1.put(num, m.getValue());
			else
				map1.put(m.getKey(), m.getValue());
		}
		System.out.println(map1);
		map1.putIfAbsent(1, "pavan");
		System.out.println(map1);
		map1.putIfAbsent(3, "pavan");
		System.out.println(map1);
	}
}
