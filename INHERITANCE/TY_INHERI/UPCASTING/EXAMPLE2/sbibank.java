class sbibank extends bank
{
	account acc;
	sbibank(){ 
		super(null);
		System.out.println("Give a Bank Name");}
	sbibank(String bank_name)
	{
		 super(bank_name);
	}

	void createacc(account acc)
	{
		this.acc=acc;
	}

}