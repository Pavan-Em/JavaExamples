package MATHODS;

import java.util.Arrays;

public class aslist {
	public static void main(String[] args) {
		int[] num= {1,2,3};
		int [] num3= {1,2,3};
		int[] num2=new int[3];
		num2[0]=1;
		num2[1]=2;
		num2[2]=3;
		System.out.println(Arrays.asList(num));
		System.out.println(Arrays.asList(num3));
		System.out.println(Arrays.asList(num2));
		
		char[] ch= {'a','b','c'};
		System.out.println(Arrays.asList(ch));
		System.out.println(num.hashCode());
		System.out.println(num3.hashCode());
		System.out.println(num2.hashCode());
	}
}
