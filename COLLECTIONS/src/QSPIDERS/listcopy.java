package QSPIDERS;
import java.util.*;
public class listcopy {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>(Arrays.asList("pavi","kera","jordan"));
		String[] s=new String[list.size()];
		LinkedList<String> ls=new LinkedList<String>(Arrays.asList(s));
		System.out.println(ls);
		Collections.copy(ls, list);
		System.out.println(ls);
		Collections.fill(list, "a");
		System.out.println(list);
	}
}
