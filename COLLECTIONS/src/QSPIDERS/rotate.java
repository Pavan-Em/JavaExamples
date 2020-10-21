package QSPIDERS;
import java.util.*;
public class rotate {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(list);
		Collections.rotate(list, 2);
		System.out.println(list);
		Collections.rotate(list, 1);
		System.out.println(list);
	}
}
