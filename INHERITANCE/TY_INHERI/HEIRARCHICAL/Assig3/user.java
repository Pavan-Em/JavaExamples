class user
{
	public static void main(String[]args)
	{
		savings_acc s1=new savings_acc("RUDRA",50000);
		s1.sdetails();
		System.out.println("===============================================");
		current_acc c1=new current_acc();
		System.out.println("===============================================");
		current_acc c2=new current_acc("BADRA",25000);
		c2.cdetails();
		System.out.println("===============================================");
		fixed_dep f1=new fixed_dep("ROJA",200000,48);
		f1.fdetails();
		System.out.println("===============================================");
		personal_loan p1=new personal_loan("AGASTHYA",200000,20000,"WORLD TOUR");
		p1.Pdetails();
		System.out.println("===============================================");
		home_loan l1=new home_loan();
		System.out.println("===============================================");
		home_loan l2=new home_loan("SEENA",100000000,100000,"BENGALURU");
		l2.hdetails();
	}
}