package RANDOM;

public class r10 {
	public static void main(String[] args) {
		String s1="hey pavan";
		String s2="hey ";
		String s3="hey pavan";
		String s4=s2.concat("pavan");
		String s5="hey "+"pavan";
		String s6="pavan";
		String s7=s2.concat(s6);
		System.out.println("s1:"+System.identityHashCode(s1));
		System.out.println("s3:"+System.identityHashCode(s3));
		System.out.println("s4:"+System.identityHashCode(s4));
		System.out.println("s5:"+System.identityHashCode(s5));
		System.out.println("s7:"+System.identityHashCode(s7));
		System.out.println("s6:"+System.identityHashCode(s6));
		System.out.println(System.identityHashCode("pavan"));
		System.out.println(System.identityHashCode(s2.concat("pavan")));
	}

}
