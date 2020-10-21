class primeno2
{
	public static void main(String[]args)
	{
	 int n=97;
	 int i;
	 for( i=2;i<n;i++)
	  {
	   if(n%i==0)
	    break;
	  }
	if (i==n)
	System.out.print(n+" is a prime no");
	else
	System.out.print(n+" is not a prime no");
	}
}