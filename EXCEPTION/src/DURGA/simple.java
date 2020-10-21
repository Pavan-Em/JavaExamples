package DURGA;

import java.io.IOException;

public class simple {
		void m() throws IOException
		{
			throw new IOException("fuck man");
		}
		void n() throws IOException
		{
			m();
		}
		
		void P() throws IOException
		{
			try
			{
				n();
			}
			catch(IOException e)
			{
				System.out.println("heh i got this");
			}
		}
		
		public static void main(String[] args) throws IOException{
			simple s=new simple();
			s.P();
			System.out.println("Normal myaan.....");
		}
}
