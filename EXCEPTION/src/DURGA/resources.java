package DURGA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class resources    {

		public static void main(String[] args) throws IOException {
			FileReader f=new FileReader("abc.txt");
			BufferedReader b=new BufferedReader(new FileReader("ab.txt"));
			try(f;b)
			{
				
			}
		}
}
