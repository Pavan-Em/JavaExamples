package RANDOM;

public class r13 {
	public static void main(String[] args) {
		String s1="hey pavan";
		String s2="hey ".concat("pavan");
		String s3=s1.toString();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}
}
