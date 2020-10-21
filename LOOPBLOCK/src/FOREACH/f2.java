package FOREACH;

public class f2 {
	public static void main(String[] args) {
		f2[] a=new f2[3];
	/*	a[0]=new f2();
		a[1]=new f2();
		a[2]=new f2();*/
		
		int[] b= new int[3];
		
		for(int x:b)
		{
			//System.out.println(x);
			x=10;
			System.out.println("im from inside for each");
		}
		System.out.println(b[1]);
		for(int i=0;i<b.length;i++)
		{
			b[i]=10;
		}
		System.out.println(b[1]);
		
	/*	for(f2 x:a)
		{
			System.out.println(x);
		}*/
		
	}
	public String toString()
	{
		return "heheheh";
	}
}
