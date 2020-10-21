class customer extends account
{
	String address;
	long phn_no;
	String acc_type;

	customer(){}

	customer(double amt_bal,String acc_type,long phn_no,String address)
	{
		super(amt_bal);
		this.acc_type=acc_type;
		this.address=address;
		this.phn_no=phn_no;
	}
}