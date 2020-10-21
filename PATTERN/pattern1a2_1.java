class pattern1a2_1
{
  public static void main(String[]args)
  {
	int n=5;
        int k=1;
        char x='a';
 	for (int i=0;i<n;i++)
	{
	 for (int j=0;j<n;j++)
	  {
	   switch((i+j)%2)
	  {
	    case 0:System.out.print(k++ +"  ");
	     break;
	    case 1:System.out.print(x++ +"  ");
             break;
	  }
	  }
	System.out.println();
	}
  }
}