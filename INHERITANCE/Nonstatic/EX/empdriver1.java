class empdriver1
{
	public static void main(String[]args)
	{
		employee e1;
		e1=new employee();
		System.out.println(e1.company_name);
		e1.eid=101;
		System.out.println(e1.eid);
		e1.work();//CTE
	}
}

/* with the help of super class object reference we cannod use
   the member of sub class   */

/* with the help of super class object reference we can use 
   static and non static members of super class   */