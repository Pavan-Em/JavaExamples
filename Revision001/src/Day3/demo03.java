package Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class demo03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(1,2));
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1.remove(num2);
		
		System.out.println(num1);
	}
}
