package te;
import employee.employee;
public class te extends employee{
	
	te(){}
	public te(String code, String ename, double esal, boolean em_status) {
		super(code,ename, esal, em_status);
		// TODO Auto-generated constructor stub
	}

	String jd="TEST ENGG";
	
	//display info
	public void display()
	{
		super .display();
		System.out.println("Emp JD      :"+jd);
	}
	
	//override toString()
	public String toString()
	{
		display();
		return "";
	}
	
	//override equals()
	public boolean equals(Object obj)
	{
		if(obj instanceof te)
			return super.equals(obj);
		return false;
	}
	
	//override hashCode()
	public int hashCode()
	{
		return super.hashCode()+jd.hashCode();
	}

}
