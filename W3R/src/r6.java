import java.util.Scanner;
class r6 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=s.nextInt();
	    int n1=n;
		int bina=0;
		int rev_bina=0;
		while(n1!=0)
		{
			int d=n1%2;
			bina=bina*10+d;
			n1=n1/2;
		}

		while(bina!=0)
		{
			int d=bina%10;
			rev_bina=rev_bina*10+d;
			bina=bina/10;
		}

		System.out.println("Binary of "+n+" is "+rev_bina);
	
	}
}