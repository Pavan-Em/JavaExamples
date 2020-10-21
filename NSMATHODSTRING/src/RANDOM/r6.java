package RANDOM;

public class r6 {
	public static void main(String[]args)
	{
		String s1="pavan";
		String s2=s1.toUpperCase();
		String s3=new String(s2);
		String s4="PAVAN";
		String s5=s1.toUpperCase();
		String s6=s1.toLowerCase();
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		System.out.println("s1:"+System.identityHashCode(s1));
		System.out.println("s2:"+System.identityHashCode(s2));
		System.out.println("s3:"+System.identityHashCode(s3));
		System.out.println("s4:"+System.identityHashCode(s4));
		System.out.println("s5:"+System.identityHashCode(s5));
		System.out.println("s6:"+System.identityHashCode(s6));
	}
}
