class saving_acc
{
	private boolean status;
	private static int no_acc;
	{
		no_acc++;
		acc_no=no_acc;
	}
	private int acc_no;
	private String cus_name;
	private double acc_bal;
	customer c;

	//getter for no_acc
	int getnoacc()
	{
		return no_acc;
	}

	//getter for acc_no
	int getaccno()
	{
		return acc_no;
	}

	//getter and setter for cus name
	String getcusname()
	{
		return cus_name;
	}
	void setcusname(String cus_name)
	{
		this.cus_name=cus_name;
	}

	//getter and setter for acc_bal
	double getaccbal()
	{
		return acc_bal;
	}
	void setaccbal(int acc_bal)
	{
		this.acc_bal=acc_bal;
	}

	//method 
	void createcusacc()
	{
		status=true;
		c=new customer(acc_no);
	}

	void createcusacc(String cus_name)
	{
		this();
		this.cus_name=cus_name;
		c=new customer(acc_no);
	}
	void createcusacc(String cus_name,int acc_bal)
	{
		this(cus_name);
		this.acc_bal=acc_bal;
		c=new customer(acc_no,acc_bal);
	}

	//withdraw
	double withdraw(double amount)
	{
		if(status)
		{
			if(amount<=acc_bal)
			{
				acc_bal=acc_bal-x;
				System.out.println("Withdraw is successful");
				System.out.println("Account bal:"+acc_bal+" rs");
			}
			else
			{
				System.out.println("Insafficient balance");
				System.out.println("Account bal:"+acc_bal+" rs");
			}
				return acc_bal;
		}
		else
			System.out.println("create account");
			return 0;
	}

	//deposite
	double deposite(double amount)
	{
		if(status)
		{
		acc_bal=acc_bal+y;
		System.out.println("Successfully deposited");
		System.out.println("Account bal:"+acc_bal+" rs");
		return acc_bal;
		}
		else 
			System.out.println("create account");
			return 0;
	}

	//info
	void getcusinfo()
	{
		if(status)
		{
		System.out.println("Customer Nmae:"+cus_name);
		System.out.println("Account No:"+acc_no);
		System.out.println("Balance amount:"+acc_bal+" rs");
		}
		else
			System.out.println("Create account ");
	}
}