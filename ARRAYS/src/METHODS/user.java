package METHODS;

import java.util.Arrays;

public class user {
	public static void main(String[] args) {
		int []a=Carrays.readarray();
		Carrays.printarray(a);
		System.out.println("\nSum of Arrays : "+Carrays.arraysum(a));
		System.out.println("Average of Arrays : "+Carrays.arrayavg(a));
		Arrays.sort(a);
		Carrays.printarray(a);
	}

}
