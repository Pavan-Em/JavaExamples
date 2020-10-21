class patternpractice
{
	public static void main(String[]args)
	{
	int x=5;
	for (int i=0;i<x;i++)
	 {
	  for (int j=0;j<x;j++)
	  {
	   
	    if (i>=j)
	    {
	      if (i%2==0)
	     
	    System.out.print(j+1+" ");
	    else
	    System.out.print("* ");
	     }
	    
	   else
	   System.out.print("  ");
	  }
	System.out.println();
	 }
	}
}