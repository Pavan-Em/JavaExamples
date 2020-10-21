package BREAK;

public class b1 {
	public static void main(String[] args) {
		int x=30;
		
		lable1:
		{
			System.out.println("Enter lable1");
		if(x==10)
		{
			System.out.println("Inside if lable1");
			break lable1;
		}
		lable2:
		{
			System.out.println("Enter lable2");
			if(x==20)
			{
				System.out.println("Inside if lable2");
				break lable2;
			}
			System.out.println("Exciting lable2");
		}
		System.out.println("Exciting lable1");
		}
		System.out.println("Im outside everything");
		
		
		
		
	}
}
