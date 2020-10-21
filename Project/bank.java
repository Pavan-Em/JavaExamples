class bank
{
	private String bank_name;
	private int bank_no;
	private String ifsc;

	bank(int bank_no,String bank_name,String ifsc)
	{
		this.bank_no=bank_no;
		this.bank_name=bank_name;
		this.ifsc=ifsc;
	}

	save_acc s=new save_acc();
	cur_acc c=new cur_acc();
	loan_acc l=new loan_acc();

	void createsavacc(String cus_name)
	{
		s.createacc(cus_name);
	}

	void createsavacc(String cus_name,int bal_amount)
	{
		s.createacc(cus_name,bal_amount);
	}
	
	void createcuracc(String cus_name)
	{
		c.createacc(cus_name);
	}

	void createcurcc(String cus_name,int bal_amount)
	{
		c.createacc(cus_name,bal_amount);
	}

}








































