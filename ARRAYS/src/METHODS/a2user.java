package METHODS;

import java.util.Arrays;

public class a2user {
	public static void main(String[] args) {
		A[][] a =new A[2][2];
		a[0][0]=new A(1,"pavan",65665,true);
		a[0][1]=new A(2,"pavi",65665,true);
		a[1][0]=new A(3,"kera",845,false);
		a[1][1]=new A(4,"jord",9423,true);
		
		System.out.println(a);
		System.out.println(Arrays.toString(a[1]));
		System.out.println(Arrays.toString(a[1]));
		String info=Arrays.toString(a[1]);
		
		int[][]  num2= { {1,2,3},
				{4,5,6},{7,8,9} };
		System.out.println(num2);
		System.out.println(Arrays.toString(num2[1]));
		System.out.println(Arrays.deepToString(num2));
		}
	}

