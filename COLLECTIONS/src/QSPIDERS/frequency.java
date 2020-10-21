package QSPIDERS;
import java.util.*;
public class frequency {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(1);
		list1.add(1.0);
		list1.add("pavan");
		list1.add('a');
		list1.add(33);
		System.out.println(list1);
		int a=Collections.frequency(list1,"pavan");
		System.out.println(a);
		
	}
}
