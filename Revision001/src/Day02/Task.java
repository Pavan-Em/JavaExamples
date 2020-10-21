package Day02;

public class Task {

	public static void main(String[] args) {
		
		String s = "pavan";
		
		char[] ch = s.toCharArray();
		int n=0;
		for(Character c : ch)
		{
			n++;
		}
		
		System.out.println("Length of String \""+s+"\" is "+n);
	}
}
