class E3
{
	public static void main(String[]args)
	{
		//possible
		automation_engg a1=new automation_engg();
		System.out.println(a1);//ref of automation_engg
		testing t1=a1;
		System.out.println(t1);//ref of automation_engg
		Employee e1=t1;
		System.out.println(e1);//ref of automation_engg
		System.out.println("================================================");
		senior_dev s1=new senior_dev();
		System.out.println(s1);//ref of senior_dev
		development d1=s1;
		System.out.println(d1);//ref of senior_dev
		Employee e2=d1;
		System.out.println(e2);//ref of senior_dev
		System.out.println("================================================");
		recruiter r1=new recruiter();
		System.out.println(r1);//ref of recruiter
		hr h1=r1;
		System.out.println(h1);//ref of recruiter
		Employee e3=h1;
		System.out.println(e3);//ref of recruiter
	}
}