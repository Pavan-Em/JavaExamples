class assig3_2
{
	public static void main(String[]args)
	{
	int m=6;
	int n=6;
	if (m<=n)
	{
	 if (m==n)
	 {
	   if (m%6 != 0 || m%7 != 0 )
	    {
		System.out.println("any num between " + m +" and " + n + " not divi by 6 and 7");
	    }
	 }
	else if (m<=n)
	 {
	 while(m<=n)
	   {
	     if (m%6==0 && m%7==0)
	      {
		System.out.println(m+" is divi by both 6 and 7");
	      }
		m++;
	   }
	 }
	
	}
	else if (m >= n)
	{
	System.out.println("m should be less than n");
	}
	else
	{
	System.out.println("any num between " + m +" and " + n + " not divi by 6 and 7");
	}
	}
}