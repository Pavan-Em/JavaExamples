class s1
{
	public static void main(String[]args)
	{
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello".hashCode());
		System.out.println(System.identityHashCode("hello"));
		System.out.println(System.identityHashCode(45));
		System.out.println(System.identityHashCode('a'));
		String m="hey yo";
		System.out.println(m.hashCode());
		System.out.println(System.identityHashCode(m));
		String n="hey yoyo";
		System.out.println(n.hashCode());
        System.out.println("a".hashCode());		



	}
}