class assigpatt1
{
	public static void main(String[]args)
	{
	int n=4;
	for(int i=0;i<n;i++)
	{
	int x=1;
	for(int j=0;j<n;j++)
	{
	if(i+j>=n-1)
	System.out.print(x++ +" ");
	else
	System.out.print("  ");
	}
	System.out.println();
	}
	
	}
}
/* OUTPUT
          1
        1 2
	  1 2 3
	1 2 3 4     */