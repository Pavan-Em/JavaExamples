package DURGA.Navigableset;
import java.util.*;
public class ns {
	public static void main(String[] args) {
		NavigableSet<Integer> num=new TreeSet<Integer>(Arrays.asList(2,4,8,7,6,4));
		System.out.println(num);
		System.out.println(num.floor(3));
		System.out.println(num.floor(4));
		System.out.println(num.lower(3));
		System.out.println(num.floor(1));
		System.out.println(num.ceiling(4));
		System.out.println(num.ceiling(5));
		System.out.println(num.higher(2));
		NavigableSet<Integer> navi=num.descendingSet();
		System.out.println(navi);
		ArrayList<Integer>  a=new ArrayList<Integer>(Arrays.asList(3,4,7,8,6));
		System.out.println(a);
		Collections.sort(a);
		int b=Collections.binarySearch(a, 6);
		System.out.println(b);
		HashSet<Integer> h=new HashSet<Integer>(Arrays.asList(1,1));
		System.out.println(h);
		a.sort(Comparator.reverseOrder());
		System.out.println(a);
		
		System.out.println("=================================");
		NavigableSet<String> st=new TreeSet<String>(Arrays.asList("pavan","kera","anand","mille"));
		System.out.println(st);
		System.out.println(st.floor("m"));
		System.out.println(st.floor("k"));
		System.out.println(st.floor("pavan"));
		System.out.println(st.lower("pavan"));
		System.out.println(st.ceiling("k"));
		System.out.println(st.higher("p"));
		String[] s=new String[2];
		s[0]="hey";
		System.out.println(Arrays.toString(s));
		String[] ss=st.toArray(new String[st.size()]);
		System.out.println(Arrays.toString(ss));
		
	}
}
