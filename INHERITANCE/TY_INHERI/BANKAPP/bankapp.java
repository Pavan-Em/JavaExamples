class bankapp
{
	public static void main(String[]args)
	{
		rbi rbi=new rbi();//to create rbi
		System.out.println("===========================");
		//create bank with ifsc code as actual argument
		sbi sbi=new sbi();//gives warning
		sbi SBI=new sbi("sbi@101");
		icici ICICI=new icici("icici@102");
		System.out.println("============================");
		//details of bank
		rbi.bankdetails(SBI);
		System.out.println();
		rbi.bankdetails(ICICI);
		System.out.println("============================");
		//customer creating account
		badra BADRA=new badra("BADRA",50000,"SAVINGS ACCOUNT",56987423,"BENGALURU");
		SBI.sa.create_sa_acc(BADRA);
		rudra RUDRA=new rudra("RUDRA",90000,"CURRENT ACCOUNT",89456211,"TUMAKURU");
		ICICI.ca.create_ca_acc(RUDRA);
		System.out.println("=============================");
		//to print details of customer
		SBI.details(BADRA);
		System.out.println();
		ICICI.details(RUDRA);
		System.out.println("==============================");
		//pay salary to employee
		SBI.paysal(new clerk(20000));
		System.out.println();
		SBI.paysal(new cashier(35000));
		
	}
}