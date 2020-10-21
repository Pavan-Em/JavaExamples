class Bank_info
{
	public static int no_of_bank;

	//getter for no_of_bank
	int getnoofbank()
	{
		return no_of_bank;
	}

	void construct_bank(String bank_name,String ifsc)
	{
		no_of_bank++;
		new bank(no_of_bank,bank_name,ifsc);
	}
}

//only 1:1