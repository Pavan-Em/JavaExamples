package STRINGDOUBT;

public class doubt2 {

	public static void main(String[] args) {
		
		String s1="oh"+"yes";
		String s2="ohyes";
		System.out.println(s1==s2);
		System.out.println("========================");
		
		final String s3="hehe";
		//String s4="oye";
		String s4=s3.concat("oye");
		String s5="heheoye";
		String s6="hehe"+"oye";
		String s7=s3+"oye";
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s5==s6);
		System.out.println(s5==s7);
		System.out.println("=======================");
		
		final String a1="oye";
		String a2="OYE";
		String a3=a1.toLowerCase();
		System.out.println(a1==a3);
		System.out.println("==========================");
		
		final String w1="hey";
		String w2=w1+"pavan";
		String w3="heypavan";
		String w4=w1.concat("pavan");
		String w5="hey".concat("pavan");
		System.out.println(w2==w3);
		System.out.println(w2==w4);
		System.out.println(w3==w5);
	}
}
