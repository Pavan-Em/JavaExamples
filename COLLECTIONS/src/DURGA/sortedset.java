package DURGA;
import java.util.*;
public class sortedset {
	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(10);
		s.add(5);
		s.add(1);
		s.add(90);
		s.add(50);
		System.out.println(s);
		System.out.println(s.subSet(10, 50));
		System.out.println(s.subSet(89, false, 90, true));
		System.out.println(s);
		
	}
}
