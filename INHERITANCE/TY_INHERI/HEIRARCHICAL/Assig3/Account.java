class Account
{
	private static int no_of_account;
	private int account_no;
	{
		no_of_account++;
		this.account_no=no_of_account;
	}

	//getter for no_of_account
	int getnoofaccount()
	{
		return no_of_account;
	}

	//getter for account_no
	int getaccountno()
	{
		return account_no;
	}

	private String IFSC="AB7755";

	//getter and setter for IFSC
	String getIFSC()
	{
		return IFSC;
	}
	void setIFSC(String IFSC)
	{
		this.IFSC=IFSC;
	}

	private String acc_holder_name;

	//getter and setter for acc_holder_name
	String getaccholdername()
	{
		return acc_holder_name;
	}
	void setaccholdername(String acc_holder_name)
	{
		this.acc_holder_name=acc_holder_name;
	}

	//constructor
	Account(){ no_of_account--;}             //i got this
	Account(String acc_holder_name)
	{
		this.acc_holder_name=acc_holder_name;
	}

	//to get account detatils
	void Mdetails()
	{
		System.out.println("Account NO     :"+getaccountno());
		System.out.println("Customer Name  :"+getaccholdername());
		System.out.println("IFSC Code      :"+getIFSC());
	}
}