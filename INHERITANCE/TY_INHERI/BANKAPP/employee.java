class employee
{
	static int no_of_emp;
	int emp_id;
	double sal;

	{
		no_of_emp++;
		emp_id=no_of_emp;
	}
	employee()
	{
		no_of_emp--;
	}

	employee(double sal)
	{
		this.sal=sal;
	}
}