package DURGA.Navigableset;

public class prime100001 {
	public static void main(String[] args) {
		int x=0;
		int n=1;
		int count=0;
		
		
		while(x==0)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					n++;
					break;
				}
				n++;
				count++;
				if(count==100001)
				{
					System.out.println("100001th prime no is:"+n);
					x=1;
					break;
				}
			}
		}
	}
}

