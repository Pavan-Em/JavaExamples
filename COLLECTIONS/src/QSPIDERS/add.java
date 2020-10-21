package QSPIDERS;
import java.util.*;
public class add {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>(Arrays.asList("pavan"));
		String[] s=new String[list.size()];
		ArrayList<String> list2=new ArrayList<>(Arrays.asList(s));
		list2.addAll(list);
		System.out.println(list2);
		Collections.copy(list2, list);
		System.out.println(list2);
		Collections.copy(list2, list);
		System.out.println(list2);
	}
}
