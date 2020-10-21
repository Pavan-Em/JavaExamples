package DURGA;

import java.awt.event.FocusAdapter;

public class d3 {
	public static void main(String[] args) {
		Integer num=200;
		System.out.println(num.intValue());
		System.out.println(num.doubleValue());
		System.out.println(num.byteValue());
		
		
		Character ch=new Character('a');
		char ch1=ch;
		System.out.println(ch1);
		
		int a=Integer.valueOf("36");
		System.out.println(a);
		int b=Integer.parseInt("10");
		System.out.println(b);
		
		
		Integer i1=100;
		String s=i1.toString();
		System.out.println(s);
		
		String s2=Integer.toString(10);
		System.out.println(s2);
		
		
		String s3=Integer.toString(15,2);
		System.out.println(s3);
		
		int i=Integer.parseInt("11",2);
		System.out.println(i);
		
		String s4=Integer.toOctalString(66);
		System.out.println(s4);
		
		Float f=Float.valueOf("10.3f");
		System.out.println(f);
		
		boolean bb=Boolean.valueOf(true);
		System.out.println(bb);
		
		System.out.println(void.class);
	}
	
	static void m1()
	{
		
	}
}
