class drive3
{
	public static void main(String[]args)
	{
		company3 ms=new company3();
		te te1=new te(1,30000);
		ms.paysal(te1);
		System.out.println("========================");
		dev dev1=new dev(2,60000);//cant use this part it'll give class cast exception error in company3
		ms.paysal(dev1);
	}
}