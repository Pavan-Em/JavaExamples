class drive2
{
	public static void main(String[]args)
	{
		company2 apple=new company2();
		te te1=new te(1,30000);
		apple.paysal(te1);
		System.out.println("======================");
		dev dev1=new dev(2,32000);//cant use this in company class
		apple.paysal(dev1);
	}
}