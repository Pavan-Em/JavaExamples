package ONE;

public class r6 {
	public static void main(String[] args) {
		String[] s= {"pavan","kera","pavi"};
		for(int i=0;i<s.length;i++)
		{
			s[i]=s[i].replaceFirst("^pa", "ke");
			System.out.println(s[i]);
		}
	}
}
