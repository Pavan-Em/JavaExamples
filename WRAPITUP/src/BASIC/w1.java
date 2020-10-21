package BASIC;

import java.util.Arrays;
import java.util.Scanner;

public class w1 {
	public static void main(String[] args) {
		Integer a=10;
		Integer b=10;
		int num=10;
		Integer c=num;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(a.equals(b));
		
		Integer[]  ar= {1,2,3};
		System.out.println(Arrays.toString(ar));
		
		int aa=a;
		System.out.println(aa);
		
		Object o=new Scanner("hehe");
		System.out.println(o.hashCode());
		
		String numarray=" 6   h   5 ".trim().replaceAll("\\s|\\W", "");
		Integer intnum=Integer.valueOf(numarray);
		System.out.println(intnum);
		
		
	}
}
