package BASIC;

public class w3  extends test{
	public static void main(String[] args) {
		test obj=new w3();
		obj.yes(10);
	}
	
	public void yes(int num)
	{
		System.out.println("hi...");
	}

}

class test
{
	public void yes(Integer num)
	{
		System.out.println("bey");
	}
}
