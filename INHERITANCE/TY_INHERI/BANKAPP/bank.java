class bank
{
	static int no_of_bank;
	int bank_id;
	{
		no_of_bank++;
		bank_id=no_of_bank;
	}
	String ifsc;

	//constructors
	bank()
	{
		no_of_bank--;
		bank_id=no_of_bank;
	}

	bank(String ifsc)
	{
		this.ifsc=ifsc;
	}
}