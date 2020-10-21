package DURGA;
import java.util.*;
public class remove {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		ArrayList l2=new ArrayList();
		l2.add(10);
		System.out.println(l.contains(Integer.valueOf(10)));
		l.set(0,60);
		System.out.println(l);
	}
}
