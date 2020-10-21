class current_acc extends Account
{
	private double acc_bal;

	//getter and setter for acc_bal
	double getaccbal()
	{
		return acc_bal;
	}
	void setaccbal(int acc_bal)
	{
		this.acc_bal=acc_bal;
	}

	//constructor
	current_acc()
	{
		System.out.println("WARNING:");
		System.out.println("You should Enter your Name to Create an Account");
	}
	current_acc(String acc_holder_name)
	{
		super(acc_holder_name);
	}
	current_acc(String acc_holder_name,int acc_bal)
	{
		super(acc_holder_name);
		this.acc_bal=acc_bal;
	}

	//to get account details
	void cdetails()
	{
		Mdetails();
		System.out.println("Account Balance:"+getaccbal()+"Rs");
	}
}