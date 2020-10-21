class drive1
{
	public static void main(String[]args)
	{
		A obj1=new A();
		System.out.println(obj1 instanceof Object);//true
		System.out.println(obj1 instanceof A);//true
		System.out.println(obj1 instanceof B);//false
		System.out.println("============================");
		B obj2=new B();
		System.out.println(obj2 instanceof Object);//true
		System.out.println(obj1 instanceof A);//true
		System.out.println(obj1 instanceof B);//true
		System.out.println("============================");
		A obj3=new B();//upcasting
		System.out.println(obj3 instanceof Object);//true
		System.out.println(obj3 instanceof A);//true
		System.out.println(obj3 instanceof B);//true
		B obj4=(B)new A();
		System.out.println(obj4 instanceof Object);//in this we'll get RUN TIME ERROR
		System.out.println(obj4 instanceof A);
		System.out.println(obj4 instanceof B);
	}

}