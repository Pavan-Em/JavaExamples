package SYNCHRONIZATION;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class array {
	public static void main(String[] args) {
		
		Integer[] num = {3,1,95,46,75,4};
		Collections.sort(Arrays.asList(num),Collections.reverseOrder());
		System.out.println(Arrays.toString(num));
	}
}
