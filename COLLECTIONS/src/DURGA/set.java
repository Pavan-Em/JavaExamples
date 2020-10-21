package DURGA;
import java.util.*;
public class set {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>(Arrays.asList(1,99,40,5));
		System.out.println(set);
		System.out.println(set.remove(99));
		System.out.println(set.remove(100));
		System.out.println("============================");
		HashSet<Integer> s1=new HashSet<Integer>(Arrays.asList(1,2,3));
		HashSet<Integer> s2=new HashSet<Integer>(Arrays.asList(2,3,4));
		System.out.println(s1.containsAll(s2));
	}
}
