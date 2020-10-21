package RANDOM;

public class r11 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("pavan");
		System.out.println(s1.capacity());
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());
		s2.append("a");
		System.out.println(s2.capacity());
		StringBuffer s3=new StringBuffer("a");
		System.out.println(s3.capacity());
		s3.append("aaaaaaaaaaaaaaa");
		System.out.println(s3.capacity());
		s3.append("aa");
		System.out.println(s3.capacity());
		System.out.println(s3.length());
		
		StringBuffer ss1=new StringBuffer(1000);
		System.out.println(ss1.capacity());
	}

}
