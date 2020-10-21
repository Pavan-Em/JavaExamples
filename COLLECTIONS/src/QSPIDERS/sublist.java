package QSPIDERS;
import java.util.*;
public class sublist {
	public static void main(String[] args) {
		ArrayList<Integer>  list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(list);
		System.out.println(list.subList(0, 3));
		//System.out.println(list.subList(3, 0));
		System.out.println(list.subList(0, 10));
	}
}
