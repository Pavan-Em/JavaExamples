class  eve
{
	public static void main(String[] args) 
	{
		Eve(10);
	}
	public static void Eve(int x)
	{
		if(x==-1)
			return;
		x--;
		Eve(x);
		int y=x+1;
		if(y%2==0)
			System.out.print(y+" ");
	}
}
//its avoid giving input +1..
//even num includes 0