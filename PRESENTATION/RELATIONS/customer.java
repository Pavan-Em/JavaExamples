class customer
{
	private int acc_no;
	private double acc_bal;

	customer(int acc_no)
	{
		this.acc_no=acc_no;
	}

	customer(int acc_no,int acc_bal)
	{
		this(acc_no);
		this.acc_bal=acc_bal;
	}

	//getter and setter for acc_no
	int getaccno()
	{
		return acc_no;
	}
	void setaccno(int acc_no)
	{
		this.acc_no=acc_no;
	}

	//getter for acc_bal
	double getaccbal()
	{
		return acc_bal;
	}

}