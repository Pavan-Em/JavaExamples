package DURGA;

public class d1 {
	public static void main(String[] args) {
		Integer num=new Integer("10");
		System.out.println(num);
		
		String st=Integer.toString(36);
		System.out.println(st);
		
		Float f=new Float("10.21f");
		System.out.println(f);
		
		Boolean b=new Boolean("yes");
		System.out.println(b);
		Boolean b1=new Boolean("no");
		System.out.println(b1);
		System.out.println(b.equals(b1));
		System.out.println(b==b1);
		Boolean b2=new Boolean("Frue");
		System.out.println(b2);
	}
}
