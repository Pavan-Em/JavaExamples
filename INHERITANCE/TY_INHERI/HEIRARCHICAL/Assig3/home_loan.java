class home_loan extends loan_acc
{
	private String address;

	//getter and setter for address
	String getaddress()
	{
		return address;
	}
	void setaddress(String address)
	{
		this.address=address;
	}

	//constructor
	home_loan()
	{
		System.out.println("WARNING:");
		System.out.println("you should enter Name , Amount, EMI(in Months) and");
		System.out.println("Address to Create an Account");
	}
	home_loan(String acc_holder_name)
	{
		System.out.println("WARNING:");
		System.out.println("Enter Amount, EMI(per Month) and Address to Create an Account ");
	}
	home_loan(String acc_holder_name,int amount,int emi)
	{
		System.out.println("WARNING:");
		System.out.println("Enter Address");
	}
	home_loan(String acc_holder_name,int amount,int emi,String address)
	{
		super(acc_holder_name,amount,emi);
		this.address=address;
	}

	//to get details
	void hdetails()
	{
		Ldetails();
		System.out.println("Address        :"+getaddress());
	}
}