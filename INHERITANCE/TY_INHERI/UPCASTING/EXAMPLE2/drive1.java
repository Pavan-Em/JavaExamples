class drive1
{
	public static void main(String[]args)
	{
		rbi rbi=new rbi();
		System.out.println(rbi.bank);
		rbi.addbank(new sbibank());
		System.out.println(rbi.bank);
		rbi.addbank(new sbibank("SBI BANK"));
		System.out.println(rbi.bank);
		System.out.println("Bank Name:"+rbi.bank.bank_name);
		rbi.bank.createacc(new sa());
	
	}
}

//be creative