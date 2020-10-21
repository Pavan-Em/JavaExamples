package QSPIDERS;
import java.util.*;
public class array {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		int[] i= {8,9};
		a.add(Arrays.toString(i));
		System.out.println(a);
		a.remove(Arrays.toString(i));
		System.out.println(a);
		a.add(Arrays.asList(8,9));
		System.out.println(a);
		int[] num= {5,6};
		a.add(Arrays.toString(num));
		System.out.println(a);
		a.remove(Arrays.asList(8,9));
		System.out.println(a);
	}
}
