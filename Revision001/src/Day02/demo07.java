package Day02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class demo07 {

	public static void main(String[] args) {

		LinkedList<String> st = new LinkedList<String>(Arrays.asList("pavan", "tools", "abi"));

		Collections.sort(st);
		System.out.println(Collections.binarySearch(st, "tools"));

		Collections.sort(st, new SortIt());
		System.out.println(Collections.binarySearch(st, "tools"));
	}
}

class SortIt implements Comparator<String> {
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
