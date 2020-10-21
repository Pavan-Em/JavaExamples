class employee
{
	private String ename;
	private int emp_id;
	private double salary;
	private String jobname;

	//setter and getter for ename
	String getename()
	{
		return ename;
	}
	void setename(String ename)
	{
		this.ename=ename;
	}

	//getter for emp_id
	int getempid()
	{
		return emp_id;
	}

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

	//constructors for initialize
	employee(int emp_id,String jobname,double salary)
	{
		this.emp_id=emp_id;
		this.jobname=jobname;
		this.salary=salary;
	}
	employee(int emp_id,String jobname,double salary,String ename)
	{
		this(emp_id,jobname,salary);
		this.ename=ename;
	}

	//get info
	void getinfo()
	{
		System.out.println("Employee ID:"+emp_id);
		System.out.println("Nmae       :"+ename);
		System.out.println("jobName    :"+jobname);
		System.out.println("Salary     :"+salary+" rs");
	}
}