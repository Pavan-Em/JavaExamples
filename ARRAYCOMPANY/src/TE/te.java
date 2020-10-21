package TE;
import EMPLOYEE.employee;
public class te extends employee{
	public String jobd="TEST ENGG";
	

	//constructor
	public te(String name, double sal, boolean mstatus) {
		super( name, sal, mstatus);
	}
	
	public void displayinfo()
	{
		super.displayinfo();
		System.out.print("Emp JD     :"+jobd);
	}
	
	public String toString()
	{
		displayinfo();
		return "";
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof te)
			return super.equals(obj);
		return false;
	}
	
	public int hashCode()
	{
		return super.hashCode()+jobd.hashCode();
	}
	
	
}
