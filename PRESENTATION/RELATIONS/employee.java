class employee
{
	private String name;
	private String jobname;
	private double salary;

	//gatter and setter for name
	String getname()
	{
		return name;
	}
	void setname(String name)
	{
		this.name=name;
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

	//getter and setter for salary
	double getsalary()
	{
		return salary;
	}
	void setsalary(int salary)
	{
		this.salary=salary;
	}

	employee(String jobname)
	{
		this.jobname=jobname;
	}
	employee(String jobname,String name)
	{
		this(jobname);
		this.name=name;
	}
	employee(String jobname,String name,double salary)
	{
		this(jobname,name);
		this.salary=salary;
	}
	
	//get empinfo
	void getempinfo()
	{
		System.out.println("Nmae:"+name);
		System.out.println("Job Name:"+jobname);
		System.out.println("Salary:"+salary+" rs");
	}

}