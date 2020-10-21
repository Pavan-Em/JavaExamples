package BASIC;

public class v4 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int b=test(a);
		System.out.println(b);
	}
	
	public static int test(int... a)
	{
		int b=0;
		for(int num:a)
		{
			if(b==0)
			{
				return num;
			}
		}
		return 0;
	}

}
