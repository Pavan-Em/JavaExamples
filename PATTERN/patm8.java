class patm8
{
	public static void main(String[]args)
	{
		int n=11;
		int m=(n/2)+1;
		char ch='A'; char c='a';
		for (int i=1;i<=m ;i++ )
		{
			for (int s=1;s<=m-i ;s++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=(i*2)-1 ;j++ )
			{
				if(i%2!=0)
					System.out.print(ch+" ");
				else
					System.out.print(c+" ");
			}
			if (i%2!=0)
				ch++;
			else 
				c++;
			System.out.println();
		}
		
		for (int i=1;i<=m-1 ;i++ )
		{
			for (int s=1;s<=i ;s++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=2*(m-i)-1 ;j++ )
			{
				if(i%2!=0)
					System.out.print(c+" ");
				else
					System.out.print(ch+" ");
			}
			if (i%2!=0)
				c++;
			else 
				ch++;
			System.out.println();
		}
	}
}
//OUTPUT
/*            A
            a a a
		  B B B B B
		    b b b
			  C            */