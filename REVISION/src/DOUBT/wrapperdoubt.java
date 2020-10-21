package DOUBT;

public class wrapperdoubt {

	public static void main(String[] args) {
		
		Integer i=Integer.valueOf("10100", 2);
		System.out.println(i);
		Integer k=20;
		Double d=k.doubleValue();
		System.out.println(d);
		Character c=new Character('a');
		char ch=c;
		System.out.println(Boolean.valueOf("no"));
		System.out.println(void.class);
		String ss=Integer.toBinaryString(33);
		System.out.println(ss);
		String s1=i.toString();
		System.out.println(s1);
		String s2=Integer.toString(10);
		System.out.println(s2);
		Long l=Long.valueOf(10);
				
	}
}
