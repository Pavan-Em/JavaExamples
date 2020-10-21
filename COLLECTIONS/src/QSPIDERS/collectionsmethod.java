package QSPIDERS;
import java.util.*;
public class collectionsmethod {
	public static void main(String[] args) {
		String[] s= {"Pavan","kera","jordan"};
		List<String> list=Arrays.asList(s);
		//Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
