class E4
{
	public static void main(String[]args)
	{
		//possible
		home_loan h1=new home_loan();
		loan_acc l1=new loan_acc();
		Account a1=new Account();
		System.out.println(h1);//ref of home_laon
		l1=h1;
		System.out.println(l1);//ref of home_loan
		a1=l1;
		System.out.println(a1);//ref of home_loan
	}
}