class  ns1
{
	static ns1 a;
	public static void main(String[] args) 
	{
		 
		 System.out.println(a);
		 a=new ns1();
		 System.out.println(a);
		 System.out.println(a.a);
		 a=new ns1();
		 System.out.println(a);
		 
		 System.out.println(a.a=new ns1());
		 System.out.println(a);//correct till here
		 a=1;//CTE
		 System.out.println(a);//CTE
	}
}
