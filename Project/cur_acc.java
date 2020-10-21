class cur_acc extends account
{
	private boolean status;

	//to create flexible amount
	void createacc(String cus_name)
	{
		status=true;
		
		new customer(acc_no,cus_name)
	}
	void createacc(String cus_name,int bal_amount)
	{
		status=true;
		new customer(acc_no,cus_name,bal_amount)
	}

	double withdraw(int amount)
	{
		if(status)
		{
			if(amount<=bal_amount)
			{
				bal_amount=bal_amount-amount;
				System.out.println("Withdrawel is Successfull");
				System.out.println("Account No     :"+acc_no);
				System.out.println("Customer Name  :"+cus_name);
				System.out.println("Balanace Amount:"+bal_amount+" Rs");
				return amount;
			}
			else
			{
				System.out.println("withdrawel is Declined");
				return 0;
			}
		}
		else
		{
			System.out.println("Create an Account");
			return 0;
		}
	}
	
	double deposite(int amount)
	{
		if(status)
		{
			if(amount>0)
			{
				bal_amount=bal_amount+amount;
				System.out.println("Money is Deposited")
				System.out.println("Account No:"+acc_no);
				System.out.println("Customer Name:"+cus_name);
				System.out.println("Balance Amoubt:"+bal_amount);
				return amount;
			}
			else
			{
				System.out.println("Deposite more then ZERO");
				return acc_bal;
			}
		}
		else
		{
			System.out.println("Create an Account");
			return 0;
		}
	}
}