class pattern246_1
{
  public static void main(String[]args)
  {
    int n=3;
    int k=2;
    for (int i=0;i<n;i++)
     {
      for (int j=0;j<n;j++)
       {
	if (i>=j)
	{
	System.out.print(k +" ");
	k=k+2;
	}
	else
	System.out.print("  ");
       }
     System.out.println();
     }
  }
}