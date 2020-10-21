package COMMON;

public class justdoit2 {
	public static void main(String[] args) {
		String s1 = "pavan";
		String s2 = "m";
		String s3 = "pavanm";
		String s4 = "pavan".concat("m");
		String s5 = s1.concat(s2);
		String s6 = s1+s2;
		String s7 = "pavan".concat(s2);
		String s8 = s1.concat("m");
		String s9 = "pavan"+"m";
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s3==s6);
		System.out.println(s3==s7);
		System.out.println(s3==s8);
		System.out.println(s3==s9);
		
	}
}
