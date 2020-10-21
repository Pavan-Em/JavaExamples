class loan_acc extends Account
{
	static int p=2;
	int q=66;

	static void laon()
	{
		System.out.println("static from loan_acc");
	}

	void loanacc()
	{
		System.out.println("non static from loan_acc");
	}
}