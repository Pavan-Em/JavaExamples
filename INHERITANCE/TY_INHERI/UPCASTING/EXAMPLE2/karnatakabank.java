class karnatakabank extends bank
{
	String bank_name;
	account acc;
	karnatakabank(){
		super(null);
		System.out.println("Give a Bank Name");}
	karnatakabank(String bank_name)
	{
		 super(bank_name);
	}

	void createacc(account acc)
	{
		this.acc=acc;
	}

}