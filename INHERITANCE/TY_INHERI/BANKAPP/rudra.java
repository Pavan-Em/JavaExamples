class rudra extends customer
{
	String cus_name;

	rudra(){}

	rudra(String cus_name,double amt_bal,String acc_type,long phn_no,String address)
	{
		super(amt_bal,acc_type,phn_no,address);
		this.cus_name=cus_name;
	}

}