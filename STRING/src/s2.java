class s2
{
	public static void main(String[]args)
	{
		String s1="hello";
		String s2="hello";
		System.out.println("s1           :"+s1);
		System.out.println("s2           :"+s2);
		System.out.println("s1.hashcode  :"+s1.hashCode());
		System.out.println("s2.hashcod   :"+s2.hashCode());
		System.out.println("s1.equals(s2):"+s1.equals(s2));
		System.out.println("s1==s2       :"+(s1==s2));//prove like this
		System.out.println("identity     :"+(System.identityHashCode(s1)==System.identityHashCode(s2)));//prove like this
	}
}