class loan_acc extends Account
{
	private double amount;
	private double emi;

	//getter and setter for amount
	double getamount()
	{
		return amount;
	}
	void setamount(int amount)
	{
		this.amount=amount;
	}

	//getter and setter for emi
	double getemi()
	{
		return emi;
	}
	void setemi()
	{
		this.emi=emi;
	}


    //constructor

	loan_acc(){}
	loan_acc(String acc_holder_name,int amount,int emi)
	{
		super(acc_holder_name);
		this.amount=amount;
		this.emi=emi;
	}

	//to get account details
	void Ldetails()
	{
		Mdetails();
		System.out.println("Loan Amount    :"+getamount()+"Rs");
		System.out.println("EMI            :"+getemi()+" Rs/Months");
	}
}
	