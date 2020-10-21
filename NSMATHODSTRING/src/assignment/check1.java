package assignment;

public class check1 {
	public static void main(String[]args)
	{
		outerloop:{
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
			{
				break outerloop;//terminate outerloop method
			}
		}
		System.out.println("im inside outerloopstatement ");
	}
	System.out.println("im outside outerloop statement");
	}

}
