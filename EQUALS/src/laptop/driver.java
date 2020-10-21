package laptop;

class driver
{
	public static void main(String[]args)
	{
		laptop sony=new laptop(4,500,2.2);
		laptop sony1=new laptop(4,1024,2.2);
		System.out.println(sony);
		System.out.println("===============================");
		System.out.println(sony1);
		System.out.println("==============================");
		System.out.println(sony==sony1);
		if(sony.equals(sony1))
			System.out.println("Both have same Configaration");
		else
			System.out.println("Both have diff Configaration");
		
	}
}