package RANDOM;

public class r2 {
	public static void main(String[]args)
	{
		aloop:
		for(int i=0;i<5;i++)
		{
			bloop:
			for(int j=0;j<5;j++)
			{
				cloop:
				for (int k=0;k<4;k++)
				{
					break aloop;
				}
	System.out.println("hehe im inside bloop");
			}
	System.out.println("hehe im inside aloop");
		}
	System.out.println("hold my beer");
	}

}
