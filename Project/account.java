class account
{
	private static int no_of_acc;
	private int acc_no;
	private string cus_name;
	private double bal_amount;
	
	
	//auto generate account number
	{
		no_of_acc++;
		this.acc_no=no_of_acc;
	}

}