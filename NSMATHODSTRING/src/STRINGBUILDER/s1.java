package STRINGBUILDER;

public class s1 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hey ");
		s1.append("hey");
		StringBuffer s6=s1.append("pavan");
		StringBuffer s2=new StringBuffer("pavan");
		s2=s1.append(s2);
		StringBuffer s4=new StringBuffer("hey pavan");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s2));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s4));
		
		StringBuilder ss=new StringBuilder("hey ");
		String ss1="hey"+ss;
		System.out.println(ss1);
	s1.append("hey");
	//s1=s2+s1;   //this is not possible bcoz only String is allowed
	
	System.out.println(s1);
		}
}
