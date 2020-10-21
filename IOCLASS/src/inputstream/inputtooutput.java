package inputstream;
import java.util.*;
import java.io.*;
public class inputtooutput 
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			fis=new FileInputStream("C:\\Users\\Windows\\Desktop\\IO\\inputpavan.txt");
			fos=new FileOutputStream("C:\\Users\\Windows\\Desktop\\IO\\outputpavan.txt");
			byte[] b=new byte[fis.available()];
			fis.read(b);
			fos.write(b);
			fos.write(System.lineSeparator().getBytes());
			byte[] b2="Successfully Written".getBytes();
			fos.write(b2);			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("No Such File Exists");
		}
		catch(IOException e)
		{
			System.out.println("Error While Streaming Data");
		}
		finally
		{
			try
			{
				if(fis!=null)
					fis.close();
				if(fos!=null)
					fos.close();
			}
			catch(IOException e)
			{
				System.out.println("Erroe While Closing File");
			}
		}
		System.out.println("Its Done And Dusted");
	}
}
