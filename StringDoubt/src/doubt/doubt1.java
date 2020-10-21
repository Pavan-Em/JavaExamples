package doubt;

public class doubt1 {
	public static void main(String[] args) {
		final String s1="pavan";
		 String s2="pavan m";
		final String s4="m";
		 String s3=s1.concat(s4);
	//	System.out.println(s3.hashCode());
	//	System.out.println(s2.hashCode());
		System.out.println(s2==s3);
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(" m"));
		
		String st=new String("pavan").intern();
		System.out.println(s1==st);
		
		String st2=new String("kera").intern();
		String s5="kera";
		System.out.println(st2==s5);
		
		String s6="PAVAN";
		String s7=s1.toUpperCase().intern();
		String s8=s1.toLowerCase();
		System.out.println(s7==s6);
		System.out.println(s1==s8);
		System.out.println("=========================");
	/*	String p1=new String("pavan");
		String p2=p1.concat("m");
		String p3=p2.intern();
		String p4="pavanm";
		System.out.println(p2==p3);
		System.out.println(p2==p4);*/
		
		String o1=new String("pavan");
		String o2=o1.concat("m");
		String o3=o2.intern();
		String o4="pavanm";
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o4));
		System.out.println(o2==o3);
		System.out.println(o2==o4);
		
		String k1=new String("kera");
		//String k2=new String("k");
		String k3=k1.concat("k");
		String k5=k3.intern();
		String k4="kerak";
		System.out.println(k3==k4);
		System.out.println("=======================");
		
		String m1="mille";
		String m6=new String("mille").intern();
		String m2=m1.toUpperCase();
		String m4="mill".concat("e");
		String m5=m4.intern();
		String m3="MILLE";
		System.out.println(m2==m3);
		System.out.println(m1==m4);
		System.out.println(m1==m6);
	}
}
