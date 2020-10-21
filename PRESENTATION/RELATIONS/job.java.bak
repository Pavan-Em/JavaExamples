class job
{
	
	private String jobname;
	private double salary;
	employee e;

	//getter and setter for jobname
	String getjobnamea()
	{
		return jobname;
	}
	void setjobname(String jobname)
	{
		this.jobname=jobname;
	}

	//getter and setter for salary
	double getsalary()
	{
		return salary;
	}
	void setsalary(int salary)
	{
		this.salary=salary;
	}

	//craete job
	void createjob(String jobname)
	{
		this.jobname=jobname;
	}
	
	//getjob
	void getjob(String jobname)
	{
		this.jobname=jobname;
		e=new employee(jobname);
	}
	void getjob(String jobname,String name)
	{
		this.jobname=jobname;
		e=new employee(jobname,name);
	}
	void getjob(String jobname,String name,int salary)
	{
		this.jobname=jobname;
		this.salary=salary;
		e=new employee(jobname,name,salary);
	}

	//jobinfo
	void jobinfo()
	{
		System.out.println("Job name:"+jobname);
		System.out.println("salary given:"+salary+" rs");
	}


}