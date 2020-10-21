package BASICMETHODS;

public class m1 {
	public static void main(String[] args) {
		String st="pavan";
		StringBuilder sb=new StringBuilder("hehe");
		//sb.append(st,1,3);
		//System.out.println(sb);
		
		StringBuilder sb2=new StringBuilder("hehe");
		System.out.println(sb.equals(sb2));
		System.out.println(sb.compareTo(sb2));
		
		StringBuilder s1=new StringBuilder("pavan");
		System.out.println(s1.length());
		s1.setLength(3);
		System.out.println(s1);
		
		
	}
}
