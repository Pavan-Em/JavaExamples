class cur_acc extends account
{
	String acc_type="Current Account";

	customer c;
	cur_acc()
	{
		
	}
	void create_ca_acc(customer c)
	{
		this.c=c;
		System.out.println("Current Account Created for the Customer ");
	}

	double deposite(double amount)
	{
		amt_bal=c.amt_bal+amount;
		System.out.println("Deposited Successfully");
		System.out.println("Account NO;"+acc_no);
		System.out.println("Amount Bal:"+amt_bal);
		return amt_bal;
	}

	double withdraw(double amount)
	{
		c.amt_bal=amt_bal-amount;
		System.out.println("Withdrawel is Successfull");
		System.out.println("Account NO;"+acc_no);
		System.out.println("Amount Bal:"+amt_bal);
		return amount;
	}

}