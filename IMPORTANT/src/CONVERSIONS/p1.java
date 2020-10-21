                          
                        //String to String[] words
						//String to String[] individual words


package CONVERSIONS;

public class p1 {
	public static void main(String[] args) {
		String st="hey man common man";
		System.out.println(st);
		System.out.println("=========================");
		String[] sta=st.split("\\s");
		for(int i=0;i<sta.length;i++)
		{
			System.out.println(sta[i]+ "");
		}
		System.out.println("===========================");
		String[] sta2=st.split("");
		String[] sta3=new String[sta2.length];
		for(int i=0;i<sta2.length;i++)
		{
			if(!(sta2[i].equals(" ")))
				sta3[i]=sta2[i];
		}
		for(int i=0;i<sta3.length;i++)
		{
			if(!(sta3[i]==null))
				System.out.println(sta3[i]);
		}
	}
}
