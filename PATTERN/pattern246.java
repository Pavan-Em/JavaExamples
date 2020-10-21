class pattern246
{
  public static void main(String[]args)
   {
     int n=3;
     int x=1;
     for (int i=0;i<n;i++)
      {
        for (int j=0;j<n;j++)
	 {
	  if(i>=j)
	  System.out.print(2*x++ +" ");
	  else
	  System.out.print(" ");
	 }
	 System.out.println();
      }
    
   }
}