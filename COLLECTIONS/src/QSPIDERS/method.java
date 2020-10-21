package QSPIDERS;
import java.util.*;
public class method {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		System.out.println(a.contains(1));
		System.out.println(a.contains(9));
		System.out.println("========================");
		a.remove((Integer)5);
		System.out.println(a);
		Object i=a.remove(1);
		System.out.println(i);
		System.out.println(a);
		ArrayList aa=new ArrayList();
		aa.add(3);
		aa.add(4);
		a.add(2,5);
		System.out.println(a);
		System.out.println(aa);
		System.out.println(a.containsAll(aa));
		System.out.println(a.indexOf(3));
		System.out.println(a.indexOf(9));
		ArrayList num=new ArrayList(Arrays.asList(1,2,3));
		System.out.println(num);
	}
}
