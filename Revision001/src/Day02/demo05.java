package Day02;

public class demo05 {

	public static void main(String[] args) {
		
		final String s1= "hey";
		String s2=s1+"pavan";
		String s3="heypavan";
		
		System.out.println(s2==s3);
		
		StringBuilder sb1 = new StringBuilder("pavan");
		StringBuilder sb2 = new StringBuilder("pavan");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		if(sb1.compareTo(sb2)==0)
			System.out.println("Both are equal");
		
	}
}
