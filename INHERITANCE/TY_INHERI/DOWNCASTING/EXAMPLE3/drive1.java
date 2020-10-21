class drive1
{
	public static void main(String[]args)
	{
		company google=new company();
		te te1=new te(1,30000);
		google.paysal(te1);
		System.out.println("======================");
		dev dev1=new dev(2,32000);//cant use this in company class
		google.paysal(dev1);
	}
}