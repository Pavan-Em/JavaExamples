package DURGA;
import java.util.*;
public class navigableset {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>(Arrays.asList(1,5,8,4,9));
		System.out.println(set);
		NavigableSet n=set.descendingSet();
		System.out.println(n);
		System.out.println(set);
		System.out.println();
		HashSet<Integer> set2=new HashSet<Integer>(Arrays.asList(10,60,55,40,99,90));
		System.out.println(set2);
	}
}
