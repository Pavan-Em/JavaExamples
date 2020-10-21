package employee;

class user
{
	public static void main(String[]atgs)
	{
		te e1=new te(1,"PAVAN",30000);
		te e2=new te(1,"PAVAN",30000);
		dev e3=new dev(1,"PAVAN",30000);
		dev e4=new dev(4,"JORDI",50000);
		System.out.println(e1);
		System.out.println("============================");
		System.out.println(e2);
		System.out.println("============================");
		System.out.println(e3);
		System.out.println("============================");
		System.out.println(e4);
		System.out.println("============================");
		if(e1.equals(e3 ))
			System.out.println("Both are Same");
		else
			System.out.println("Both are Different");
	}
}