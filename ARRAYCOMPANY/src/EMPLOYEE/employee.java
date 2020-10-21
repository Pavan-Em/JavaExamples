package EMPLOYEE;
import COMPANY.company;
import java.util.*;
public class employee {
	private static int no_of_emp;
	private int eid;
	private String name;
	private double sal;
	private boolean mstatus;
	private String code;
	
	//gettter and setter for no_of_emp
	public static int getNo_of_emp() {
		return no_of_emp;
	}
	public static void setNo_of_emp(int no_of_emp) {
		employee.no_of_emp = no_of_emp;
	}
	
	//getter and setter for eid
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	//getter and setter for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//getter and setter for sal
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	//getter and setter for mstatus
	public String isMstatus() {
		if(mstatus)
			return "Married";
		else
			return "Single";
	}
	public void setMstatus(boolean mstatus) {
		this.mstatus = mstatus;
	}
	
	//getter for code
	public String getCode()
	{
		return code;
	}
	
	//constructor
	employee(){}
	
	
	public employee(String name, double sal, boolean mstatus) {
		no_of_emp++;
		this.eid=no_of_emp;
		this.name = name;
		this.sal = sal;
		this.mstatus = mstatus;
		this.code=generatecode(6);
	}
	
	public String generatecode(int a)
	{
		int[] num=new int[a/2];
		char[] ch=new char[a/2];
		String stnum="";
		for(int i=0;i<a/2;i++)
		{
			//Random r=new Random();
			num[i]=(int)(Math.random()*10);
			stnum+=num[i];
			//num[i]=r.nextInt(10);
			ch[i]=(char)((int)(Math.random()*26)+65);
		}
		return String.valueOf(ch)+stnum;
	}
	
	//to display employee info
	public void displayinfo()
	{
		System.out.println("Employee Details:-");
		System.out.println("Emp ID     :"+eid);
		System.out.println("Emp Code   :"+code);
		System.out.println("Emp Name   :"+name);
		System.out.println("Emp Salary :"+sal+"Rs");
		if(mstatus)
		System.out.println("Emp MStatus:Married");
		else
			System.out.println("Emp MStatus:Single");
	}
	
	public boolean equals(Object obj)
	{
		employee ob=(employee)obj;
		return eid==ob.eid &&
				name.equals(ob.name)&&
				sal==ob.sal&&
				mstatus==ob.mstatus;
	}
	
	public int hashCode()
	{
		int hc=0;
		hc+=eid;
		hc+=name.hashCode();
		hc+=(int)sal;
		hc+=mstatus?1:0;
		return hc;
	}
}
