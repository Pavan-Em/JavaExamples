class k
{
	public static void main(String[]args)
	{
		int n=5;
		int m=3;
		for(int i=0;i<n;i++)
		{
			System.out.print("* ");
			if(i==m-1)
			{
				System.out.println();
					continue;
			}
			for(int j=0;j<m;j++)
			{
				
				if(j>0)
                {
				if((j==1 && (j+i)%2==0)||(j==2 && (i+j)%2==0))
					System.out.print("* ");
				else
					System.out.print("  ");
				}
			}
			System.out.println();
			}
	}

}