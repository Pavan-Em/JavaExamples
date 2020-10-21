class jobdrive
{
	//only types of job
	static job jobm=new job("Manager");
	static job jobc=new job("Clerk");
	
	//to check degree status
	public void getjob(boolean status)
	{
		if(status)
			jobm.getjob(status);
		else
			jobc.getjob(status);
	}
	public void getjob(boolean status,String name)
	{
		if(status)
			jobm.getjob(status,name);
		else
			jobc.getjob(status,name);
	}

	public static void main(String[]args)
	{
		jobdrive gj=new jobdrive();
		System.out.println(jobm.getjobname());
		System.out.println(jobc.getjobname());
		gj.getjob(true,"Badra");
		System.out.println(jobm.getsalary());
		jobm.e1.getinfo();
		gj.getjob(false,"Rudra");
		jobc.e2.getinfo();
		jobc.e2.setsalary(30000);
		jobc.e2.getinfo();

	}
}