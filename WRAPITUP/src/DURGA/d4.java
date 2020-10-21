package DURGA;

public class d4 {
	public static void main(String[] args) {
		Integer num1=new Integer(10);
		Integer num2=new Integer(10);
		System.out.println(num1==num2);
		System.out.println(num1.equals(num2));
		
		Double d=new Double(10.23);
		int i=d.intValue();
		System.out.println(i);
		
		int i1=(int)Math.floor(Double.parseDouble("10.23"));
		System.out.println(i1);
		
		Double dd=(double)10;
		
		Integer s1=10;
		int s2=20;
		String st1=s1.toString();
		String st2=Integer.toString(s2);
		System.out.println(st1);
		System.out.println(st2);
		
		byte n=33;
		String sb=Byte.toString(n);
		}
}
