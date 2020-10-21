class company3
{
	void paysal(employee emp)//
	{
		System.out.println("EID:"+emp.eid);
		System.out.println("SALARY:"+emp.sal);
		System.out.println("JOB DES:"+((te)emp).jb);//if i use dev it'll give class cast exception error during run time so not proper design
		System.out.println("Salay paid to employee");
	}
}