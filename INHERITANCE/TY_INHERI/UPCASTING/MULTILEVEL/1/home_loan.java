class home_loan extends loan_acc
{
	static int x=3;
	int y=88;

	static void home()
	{
		System.out.println("static from home_loan");
	}

	void homeloan()
	{
		System.out.println("non static from home_loan");
	}
}