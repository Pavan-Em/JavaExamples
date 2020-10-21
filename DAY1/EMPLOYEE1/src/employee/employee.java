package employee;

public class employee {
	private static String com_name="DREAMS";
	private static int no_of_emp;
	private int eid;
	private String ename;
	private double esal;
	private boolean em_status;
	private String code;
	
	//getter for code
	public String getcode()
	{
		return code;
	}
	
	//getter for no_of_emp
	public static int getNo_of_emp() {
		return no_of_emp;
	}
	
	//getter and setter for com_name
	public static String getcom_name() {
		return com_name;
	}
	public static void setcom_name(String com_name) {
		employee.com_name = com_name;
	}
	
	//getter  for eid
	public int geteid() {
		return eid;
	}
	
	//getter and setter for ename
	public String getename() {
		return ename;
	}
	public void setename(String ename) {
		this.ename=ename;
	}
	
	//getter and setter for esal
	public double getesal() {
		return esal;
	}
	public void setesal(double esal) {
		this.esal = esal;
	}
	
	//getter and setter for m_status
	public void getEm_status() {
		if(em_status)
		{
			System.out.println("Married");
		}
		else
			System.out.println("Single");
	}
	public void setem_status(boolean em_status) {
		this.em_status = em_status;
	}
	
	//constructor
	public employee(){}
	public employee(String code, String ename, double esal, boolean em_status) {
		no_of_emp++;
		eid=no_of_emp;
		this.code=code;
		this.ename = ename;
		this.esal = esal;
		this.em_status = em_status;
	}
	
	//display info
	public void display()
	{
		System.out.println("Emp ID      :"+eid);
		System.out.println("Emp Code    :"+code);
		System.out.println("Emp Name    :"+ename);
		System.out.println("Emp Sal     :"+esal+"/-");
		if(em_status)
			System.out.println("Emp M_Status:MARRIED");
		else
			System.out.println("Emp M_Status:SINGLE");
	}
	
	//no need of toString()
	
	//override equals()
	public boolean equals(Object obj)
	{
		employee o=(employee)obj;
		return eid==o.eid &&
				ename==o.ename &&
				esal==o.esal &&
				em_status==o.em_status;
	}
	
	//override hashCode()
	public int hashCode()
	{
		int hc=0;
		hc=eid;
		hc+=ename.hashCode();
		hc+=(int)esal;
		hc+=em_status?1:0;
		return hc;
	}
	
}
