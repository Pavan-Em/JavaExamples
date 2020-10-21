class savings_acc extends Account
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
	savings_acc()
	{
		System.out.println("WARNING:");
		System.out.println("Yjaou should Enter your Name to Create an Account");
	}
	savings_acc(String acc_holder_name)
	{
		super(acc_holder_name);
	}
	savings_acc(String acc_holder_name,int acc_bal)
	{
		super(acc_holder_name);
		this.acc_bal=acc_bal;
	}

	//to get account details
	void sdetails()
	{
		Mdetails();
		System.out.println("Account Balance:"+getaccbal()+"Rs");
	}
}