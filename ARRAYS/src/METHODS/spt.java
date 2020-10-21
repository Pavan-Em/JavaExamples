package METHODS;

import java.util.Arrays;

public class spt {
	public static void main(String[] args) {
		String s="hey pavan";
		String[] sa=s.split(" ");
		System.out.println(sa);
		System.out.println(Arrays.toString(sa));
		String[] sa2=s.split("");
		System.out.println(Arrays.toString(sa2));
	}
}
