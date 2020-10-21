package QSPIDERS;
import java.util.*;
public class disjoint {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3));
		ArrayList<Double> list2=new ArrayList<>(Arrays.asList(1.0,2.0,4.0));
		ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(3,4,5));
		System.out.println(Collections.disjoint(list1, list2));
		System.out.println(Collections.disjoint(list1, list3));
		
		Integer[] num1= {1,2,3};
		Integer[] num2= {3,4,5};
		System.out.println(Collections.disjoint(Arrays.asList(num1), Arrays.asList(num2)));
		
		
	}
}
