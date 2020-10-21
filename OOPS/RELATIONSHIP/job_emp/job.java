class job
{
	static int num_worker1;//as manager
	static int num_worker2;//as clerk
	private String jobname;
	private double salary;
	employee e1;
	employee e2;

	//getter and setter for salary
	double getsalary()
	{
		return salary;
	}
	void setsalary(double salary)
	{
		this.salary=salary;
	}

	//getter and setter for jobname
	String getjobname()
	{
		return jobname;
	}
	void setjobname(String jobname)
	{
		this.jobname=jobname;
	}

	//job create constructor
	job(String jobname)
	{
		this.jobname=jobname;
	}

	//getjob
	void getjob(boolean dstatus)
	{
		if(dstatus)
		{
			num_worker1++;
			this.salary=50000;
			System.out.println("Got a job as Manager");
			e1=new employee(num_worker1,"Manager",salary);
		}
		else
		{
			num_worker2++;
			this.salary=25000;
			System.out.println("Got a job as Clerk");
			e2=new employee(num_worker2,"cleark",salary);
		}
	}
	void getjob(boolean dstatus,String name)
	{
		if(dstatus)
		{
			num_worker1++;
			this.salary=50000;
			System.out.println(name+" Got a job as Manager");
			e1=new employee(num_worker1,"Manager",salary,name);
		}
		else
		{
			num_worker2++;
			this.salary=25000;
			System.out.println(name+" Got a job as Clerk");
			e2=new employee(num_worker2,"clerk",salary,name);
		}
	}
}