class loan_acc extends account
{
	private boolean status;

	double applyloan(String cus_name,int amount)
	{
		if(elligibale)
		{
			status=true;
			bal_amount=amount;
			System.out.println("Account No:"+acc_no);
			System.out.println("Customer Name:"+cus_name);
			System.out.println("Loan Amount:"+bal_amount
			return bal_amount;
		}
		else
		{
			System.out.println("you are not elligibale to take a loan");
			return 0;
		}
	}

	double withdraw(int amount)
	{
		if(status)
		{
			if(amount<=bal_amount)
			{
				bal_amount=bal_maount-amount;
				System.out.println("Withdrawel is successful");
				System.out.println("Account No   :"+acc_no);
				System.out.println("Customer Name:"+cus_name);
				System.out.println("Loan Amount  :"+acc_bal);
				return amount;
			}
			else
			{
				System.out.println("No in Account")
				System.out.println("Withdrawel is Declined")
				return 0;
			}
		}
		else
		{
			System.out.println("Take a Loan")
			return 0;
		}
	}
}