package METHODS;

public class durga {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {6,7,8,9,4};
		b=a;
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		int[] c=new int[2];
		c=b;
		a=c;
}
}
