class drive3
{
	public static void main(String[]args)
	{
		A obj1=new B();
		System.out.println("b:"+((B)obj1).b);
		System.out.println("j:"+((B)obj1).j);
		((B)obj1).fromb();
		((B)obj1).testb();
		System.out.println("===============OR===============");
		B obj2=(B)obj1;
		System.out.println("b:"+obj2.b);
		System.out.println("j:"+obj2.j);
		obj2.fromb();
		obj2.testb();
	}
}