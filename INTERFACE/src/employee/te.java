package employee;

class te extends employee
{
	private int jobid=1;

	//getter and setter for jobid
	public  int getjobid()
	{
		return jobid;
	}
	public  void setjobid(int jobid)
	{
		this.jobid=jobid;
	}

	private String jd="TEST ENGINEER";

	//getetr and setter for jd
	public  String getjd()
	{
		return jd;
	}
	public  void setjd(String jd)
	{
		this.jd=jd;
	}

	//constructors
	public te(){}

	public te(String ename,double sal)
	{
		super(ename,sal);
	}

	public void displayinfo()
	{
		super.displayinfo();
		System.out.println("Job Name  :"+jd);
	}

	public void work()
	{
		System.out.println(getename()+" is working his assoff as "+ jd);
	}

	public void paysal()
	{
		super.paysal();
		System.out.println("Jod ID  :"+jobid);
		System.out.println("Job Name:"+jd);
	}
}