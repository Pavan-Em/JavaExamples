package DURGA;
import java.util.*;
public class d1 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add( 20);
		System.out.println(l);
		l.set(1, 30);
		System.out.println(l);
		System.out.println(l.indexOf(40));
		System.out.println(l.get(1));
		l.add(null);
		System.out.println(l);
		
		ArrayList l1=new ArrayList();
		System.out.println(l1.size());
		
		ArrayList<Object> l2=new ArrayList();
		l2.add(2);
		l2.add(1);
		l2.add(2);
		System.out.println(l2);
		l2.remove(Integer.valueOf(2));
		System.out.println(l2);
	}
}
