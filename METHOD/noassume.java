class noassume
{
	public static void main(String[]args)
	{
		String res=prime(7);//data type string
		System.out.println(res);
	}
	public static String prime(int x)//mention string
	{
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
				return x+" is not a prime num";//27 is not a prime num
		}
		return x+" is a prime num";//27 is a prime num
	}
		
}