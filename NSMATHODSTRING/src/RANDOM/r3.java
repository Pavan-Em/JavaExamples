package RANDOM;

public class r3 {
	public static void main(String[]args)
	{
		String s1="hey pavan";
		String s2="hey pavan";
		String s3="hey";
		String s4=s3+" pavan";//s3 acts as variable so concat during runtime
		String s5="hey pavan";
		String s6="hey "+"pavan";//both are constant so concat during compile time
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1==s4:"+(s1==s4));
		System.out.println("s1:"+s1);
		System.out.println("s4:"+s4);
		System.out.println("s5:"+s5);
		System.out.println("s1==s5:"+(s1==s5));
		System.out.println("s1==s6:"+(s1==s6));
		final String s7="hey ";
		String s8=s7+"pavan";//s7 is final so acts as constant so concat during compiletime
		System.out.println("s1==s8:"+(s1==s8));
		System.out.println("compareToIgnoreCase():"+("pavan".compareToIgnoreCase("PAVAN")));
	}

}
