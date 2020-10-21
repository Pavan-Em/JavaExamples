class drive1
{
	public static void main(String[]args)
	{
		A o1=new A();
		System.out.println(o1.a);
		System.out.println(o1.b);
		o1.test();
		o1.exam();
		System.out.println("==============================");
		B o2=new B();
		System.out.println(o2.a);
		System.out.println(o2.b);
		o2.test();
		o2.exam();
		System.out.println("==============================");
		A o3=new B();
		System.out.println(o3.a);/* this portion is very intersting sir might teach in method over and polimorphizam */
		System.out.println(o3.b);
		o3.test();
		o3.exam();//bcoz this give diff ans check out
		System.out.println("==============================");
		B o4=(B)o3;
		System.out.println(o4.a);
		System.out.println(o4.b);
		o4.test();
		o4.exam();


	}
}