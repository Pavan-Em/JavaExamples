class rbi
{
	bank b;
	rbi()
	{
		System.out.println("RBI Created");
	}
	
	void addbank(bank b)
	{
		this.b=b;
		System.out.println("Bank is Created ");
	}

	void bankdetails(bank b)
	{
		System.out.println("Bank ID:"+b.bank_id);
		if(b instanceof sbi)
			System.out.println("Bank Name:"+((sbi)b).bank_name);
		if(b instanceof icici)
			System.out.println("Bank Name:"+((icici)b).bank_name);
		System.out.println("IFSC Code:"+b.ifsc);
	}
}