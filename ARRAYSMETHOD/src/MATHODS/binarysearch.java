package MATHODS;

import java.util.Arrays;

public class binarysearch {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6};
		System.out.println(Arrays.binarySearch(num, 9));
		
		char[] ch= {'a','b','c','d'};
		System.out.println(Arrays.binarySearch(ch, 'o'));
		
		int[] num2= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.binarySearch(num2,1,5,7));
		char[] ch2= {'a','b','c','d'};
		System.out.println(Arrays.binarySearch(ch2, 1,2,'b'));
		
		System.out.println(Arrays.compare(num, num2));
		
		System.out.println(Arrays.toString(Arrays.copyOf(num, 10)));
		
		int[] n=Arrays.copyOf(num, 20);
		System.out.println(Arrays.toString(n));
		
		
		
		int[] n1=Arrays.copyOf(num,2);
		System.out.println(Arrays.toString(n1));
		
		Arrays.fill(num, 3);
		System.out.println(Arrays.toString(num));
		
		
		int[] m10= {1,2,3};
		int[] m2= {1,2,3};
		System.out.println(Arrays.mismatch(m10, m2));
		Arrays.fill(num2,1, 6,9);
		System.out.println(Arrays.toString(num2));
		
	}
}
