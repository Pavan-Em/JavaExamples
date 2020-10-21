class company2
{
	void paysal(employee emp)//
	{
		System.out.println("EID:"+emp.eid);
		System.out.println("SALARY:"+emp.sal);
		System.out.println("JOB DES:"+emp.jb);//here cant use members of sub class bcoz downcasting is not done
		System.out.println("Salay paid to employee");
	}
}