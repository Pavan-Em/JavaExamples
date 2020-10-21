package RANDOM;

public class r9 {
	public static void main(String[]args)
	{
		String s1="hey";
		String s2=("hey pavan");
		String s10="hey ".concat("pavan");
		String s3=s1.concat(" pavan");
		String s4=s2.toString();
		System.out.println("s2==s3:"+(s2==s3));
		System.out.println("s2==s4:"+(s2==s4));
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println("s2identity:"+System.identityHashCode(s2));
		System.out.println("s3idnetity:"+System.identityHashCode(s3));
		System.out.println("s4identity:"+System.identityHashCode(s4));
		System.out.println("s10:"+System.identityHashCode(s10));
		System.out.println("s2==s10:"+(s2==s10));
		System.out.println("s3==s10:"+(s3==s10));
		
		String a1=new String("oh");
		a1=a1.concat(" pavan");
		String a2=new String("hey pavan");
		String a3="hey pavan";
		String a4="hey pavan";
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a2));
		System.out.println(System.identityHashCode(a3));
		System.out.println(System.identityHashCode(a4));
		System.out.println(System.identityHashCode(a1.concat(" pavan")));
		System.out.println(System.identityHashCode(a1.concat(" pavan")));
		
	}
}
