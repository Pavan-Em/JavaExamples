class  odds
{
	public static void main(String[] args) 
	{
		Odds(15);
	}
	public static void Odds(int x)
	{
		if(x==0)
			return;
		x--;
		Odds(x);
		int y=x+1;
		if(y%2!=0)
			System.out.print(y+" ");
	}
}
//its avoid giving input +1..
