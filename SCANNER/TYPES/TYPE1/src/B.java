class B extends A
{
	public static void main(String[]args)
	{
		int q;
		System.out.print("enter q:");
		q=s.nextInt();
		System.out.println("q:"+q);
		System.out.println("a:"+a);
		System.out.print("enter a:");
		a=s.nextInt();
		System.out.println("a:"+a);
		B sub=new B();
		System.out.print("enter i:");
		sub.i=sub.ns.nextInt();
		System.out.println("i:"+sub.i);
	}
}