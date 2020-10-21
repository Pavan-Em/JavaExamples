class prob4
{
	public static void main(String[]args)
	{
		char val=' ';
		if(val>='a' && val<='z' || val>='A' && val<='Z')
		{
		System.out.println(val+" is a alphabet");
		}
		else if(val>='0' && val<='9')
		{
		System.out.println(val+"is a num");
		}
		else if(val==' ')
		{
		System.out.println(val+"is a space");
		}
		else
		System.out.println(val+"is a sc");
	}
}