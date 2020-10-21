class primeno
{
  public static void main(String[]args)
   {
     int n=10;int j;
    for (int i=1;i<=n;i++)
	{
	boolean isprime=true;
	for ( j=2;j<i;j++)
	 {
	   if(i%j==0)
	    {
	      isprime==false;
	      break;
	    }
         }
	if(isprime)
	System.out.print(i +" ");
	}
   }
}