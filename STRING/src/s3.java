class s3
{
	public static void main(String[]args)
	{
		String s1="hey";
		String s2="hey";
		System.out.println("s1          :"+s1);
		System.out.println("s2          :"+s2);
		System.out.println("s1==s2      :"+(s1==s2));
		System.out.println("s1.hc       :"+s1.hashCode());
		System.out.println("s2.hc       :"+s2.hashCode());
		System.out.println("s1.hc==s2.hc:"+(s1.hashCode()==s2.hashCode()));
		System.out.println("identity    :"+(System.identityHashCode(s1)==System.identityHashCode(s2)));
		s1 += "baby";
		System.out.println("==============================");
		System.out.println("s1          :"+s1);
		System.out.println("s2          :"+s2);
		System.out.println("s1==s2      :"+(s1==s2));
		System.out.println("s1.hc       :"+s1.hashCode());
		System.out.println("s2.hc       :"+s2.hashCode());
		System.out.println("s1.hc==s2.hc:"+(s1.hashCode()==s2.hashCode()));
		System.out.println("identity    :"+(System.identityHashCode(s1)==System.identityHashCode(s2)));
	}
		
}