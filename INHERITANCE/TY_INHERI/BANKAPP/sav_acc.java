class sav_acc extends account
{
	String acc_type="Savings Account";
	customer c;
	sav_acc()
	{
		
	}
	void create_sa_acc(customer c)
	{
		this.c=c;
		System.out.println("Savings Account is Created for the Customer ");
	}

	double deposite(double amount)
	{
		amt_bal=amt_bal+amount;
		System.out.println("Deposited Successfully");
		System.out.println("Account NO;"+acc_no);
		System.out.println("Amount Bal:"+amt_bal);
		return amt_bal;
	}

	double withdraw(double amount)
	{
		amt_bal=amt_bal-amount;
		System.out.println("Withdrawel is Successfull");
		System.out.println("Account NO;"+acc_no);
		System.out.println("Amount Bal:"+amt_bal);
		return amount;
	}

}