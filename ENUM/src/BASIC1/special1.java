package BASIC1;

public class special1 {
	
	public static void main(String[] args)
	{
	colour[] c=colour.values();
	for(colour cc:c) {
		System.out.print(cc+"--->");
		cc.info();
	}
	}

}


enum colour
{
	black
	{
		public void info()
		{
			System.out.println("Special Colour");
		}
	},green,blue;
	
	public void info()
	{
		System.out.println("just a colour");
	}
}
