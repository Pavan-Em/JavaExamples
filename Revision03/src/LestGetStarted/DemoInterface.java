package LestGetStarted;

import java.util.Scanner;

public class DemoInterface {
	public static void main(String[] args) {
		
		String s1 = new String("Pavan");
		String s2 = new String ("Pavan");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		Scanner s =  new Scanner(System.in);
		
	    double d =s.nextInt();
	    System.out.println(d);
	    
	    Double a = 23.3;
	    Double b = 23.3;
	    System.out.println(a.hashCode());
	    System.out.println(b.hashCode());
	}

}
