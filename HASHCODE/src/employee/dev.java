package employee;

class dev extends employee
{
	String jd="DEVELOPER";

	dev() {}

	dev(int eid,String ename,double esal,boolean m_status)
	{
		super (eid,ename,esal,m_status);
	}

	public void display()
	{
		super.display();
		System.out.println("Jod D      :"+jd);
	}

	public String toString()
	{
		display();
		return "";
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof te)
		{
			return super.equals(obj);
		}
		return false;
	}

	public int hashCode()
	{
		return super.hashCode()+jd.hashCode();
	}
}