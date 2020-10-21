class caldriver
{
	public static void main(String[]args)
	{
		basiccalver2 c=new basiccalver2();
		System.out.println("Brand Name:"+c.getbrand());
		int addres1=c.add(10,20);
		System.out.println("Sum of 2 num:"+addres1);
		int subres1=c.sub(10,20);
		System.out.println("sub of 2 num:"+subres1);
		double mulres1=c.mul(10,20);
		System.out.println("mul of 2 num:"+mulres1);
		double divres1=c.div(10,20);
		System.out.println("div of 2 num:"+divres1);
	}
}