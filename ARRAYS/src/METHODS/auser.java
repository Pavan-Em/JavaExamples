package METHODS;

import java.util.Arrays;

public class auser {
	public static void main(String[] args) {
		//A c=new A();
		A[] a=new A[4];
		a[0]=new A(1,"pavan",3000,true);
		a[1]=new A(2,"pavi",5015,false);
		a[2]=new A(1,"pavan",3000,true);
		a[3]=new A(4,"jord",5015,true);
		System.out.println(Arrays.toString(a).replaceAll("|,|\\[|\\]", ""));
		System.out.println(a[0]);
		System.out.println(a[1].b);
		System.out.println(a[0].hashCode()==a[2].hashCode());
		System.out.println(a[0].equals(a[2]));
		
		int[] num= {1,2,3};
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		String st=Arrays.toString(num);
		System.out.println(st);
		
		A m=a[0];
		System.out.println(m.b);
		//A n=a;----------> this is not possible
		
		
	}
}
