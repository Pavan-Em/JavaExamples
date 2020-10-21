package BASIC;

public class A2 {
	static boolean b;
	public static void main(String[] args) {
		int[] a=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			sum+=a[i];
		}
		System.out.println("\nSum of Array:"+sum);
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(""
				+ "Max num in array list:"+max);
		System.out.println("Min num in array list:"+min);
	}

}
