package ONE;

public class r7 {
	public static void main(String[] args) {
		String s="hey pavan";
		s=s.replaceAll("\\b[a-zA-Z]{2}", "ra").toUpperCase();
		System.out.println(s);
	}
}
