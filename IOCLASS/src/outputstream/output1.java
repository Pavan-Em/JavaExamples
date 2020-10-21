package outputstream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class output1  {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the path:");
		String path=s.nextLine().trim();
		System.out.println("Enter the file Name:");
		String filename=s.nextLine().trim();
		String fullpath=path+"\\"+filename+".txt";
		FileOutputStream fos=new FileOutputStream(fullpath);
		System.out.println("Enter a Sentence to Write:");
		String sen=s.nextLine();
		byte[] b=sen.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Its done");
		
		//System.out.println();
		
				
	}

}

