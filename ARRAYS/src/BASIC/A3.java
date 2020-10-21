package BASIC;

public class A3 {
	public static void main(String[] args) {
		int n=7;
		int a[]= {5,6,3,0,1};
		int b[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[j]==i)
				{
					b[i]=i;
					break;
				}
				if(j==n-1)
			{
				b[i]=-1;
				i--;
			}
			}
		}
		System.out.print(b[0]+" ");
		System.out.print(b[1]+" ");
		System.out.print(b[2]+" ");
		System.out.print(b[3]+" ");
		System.out.print(b[4]+" ");
		System.out.print(b[5]+" ");
		System.out.print(b[6]+" ");
		System.out.print(b[7]+" ");
		System.out.print(b[8]+" ");
		System.out.print(b[9]+" ");
	}
}
