class account 
{
	static int no_of_acc;
	int acc_no;
	double amt_bal;
	

	//to create acc_no
	{
		no_of_acc++;
		acc_no=no_of_acc;
	}

	//constructors
	account ()
	{
		no_of_acc--;
	}
	account (double amt_bal)
	{
	
		this.amt_bal=amt_bal;
	}
}