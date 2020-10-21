class patm6
{
	public static void main(String[]args)
	{
		int n=3;
		char ch;
		for (int i=0;i<n ;i++ )
		{
			ch='a';
			for (int j=0;j<i+n ;j++ )
			{
				if(i+j>=n-1)
					System.out.print(ch++ +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
//OUTPUT
/*          a
          a b c
		a b c d e      */
   