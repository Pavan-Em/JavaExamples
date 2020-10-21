class pali
{
	public static void main(String[]args)
	{
		int num=12621;
		int no=num;
		int rem;
		int rev=0;
		while(no != 0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(rev==num)
			System.out.println(num+" is a palindrome num");
		else
			System.out.println(num+" is not a palindrome num");
	}
}