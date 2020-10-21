class empdriver2
{
	public static void main(String[]args)
	{
		testengineer e1=new testengineer();
		System.out.println("comoany name:"+e1.company_name);
		System.out.println("EID:"+e1.eid);
		e1.work();
		System.out.println("NO of test engineer "+e1.company_name+" is "+e1.count);
	}
}

/* with help of sub class obj reference we can use static and non static members of
   both sub class and super class    */