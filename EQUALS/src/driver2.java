class laptop
{
	int ram;
	int hd;
	double ps;

	laptop(){}

	laptop(int ram,int hd,double ps)
	{
		this.ram=ram;
		this.hd=hd;
		this.ps=ps;
	}

	public String toString()
	{
		System.out.println(ram);
		System.out.println(hd);
		System.out.println(ps);
		return "";
	}
}

class driver2
{
		public static void main(String[]args)
	{
			laptop x=new laptop(4,500,2.2);
			laptop y=new laptop(4,500,2.2);
			System.out.println(x==y);
			System.out.println(x.equals(y));
	}
}