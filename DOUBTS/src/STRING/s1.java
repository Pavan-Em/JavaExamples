package STRING;

public class s1 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("    pavan");
		System.out.println(sb);
		String s=sb.toString().trim();
		System.out.println(s);
		
		
		String s1=" ";
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
	}
}
