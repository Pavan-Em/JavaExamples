class fixed_dep extends Account
{
	private double amount;
	private int term;

	//getter and setter for amount
	double getamount()
	{
		return amount;
	}
	void setamount(int amount)
	{
		this.amount=amount;
	}

	//getter and setter for term
	int getterm()
	{
		return term;
	}
	void setterm()
	{
		this.term=term;
	}
	
	//constructor
	fixed_dep()
	{
		System.out.println("WARNING:");
		System.out.println("you should enter Both Name , Amount to Deposit and");
        System.out.println(" Time Period(term) in Months to Create An Account");
	}
	fixed_dep(String acc_holder_name)
	{
		System.out.println("WARNING:");
		System.out.println("Enter Amount to Deposit and Time period(term)in Months");
	}
	fixed_dep(String acc_holder_name,int amount)
	{
		System.out.println("WARNING:");
		System.out.println("Enter Time period(term) in Months");
	}
	fixed_dep(String acc_holder_name,int amount,int term)
	{
		super(acc_holder_name);
		this.amount=amount;
		this.term=term;
	}

	//to get account details
	void fdetails()
	{
		Mdetails();
		System.out.println("Fixed Deposit  :"+getamount()+"Rs");
		System.out.println("Term           :"+getterm()+" Months");
	}
}