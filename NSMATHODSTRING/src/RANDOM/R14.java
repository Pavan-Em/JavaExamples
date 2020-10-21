package RANDOM;

public class R14 {
	public static void main(String[] args) {
		String s="pavanis is is okis ispaisvan";
		System.out.println(s.replace("is", "was"));
		System.out.println(s.replaceFirst("is", "was"));
		System.out.println(s.replaceAll("is", "was"));
		System.out.println(s.replaceAll("is(.)", "was"));
		System.out.println(s.replaceAll("is(.*)", "was"));
		System.out.println(s.replaceAll(" ", ""));
	}

}
