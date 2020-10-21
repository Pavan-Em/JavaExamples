package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class basic1 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Windows\\Desktop\\IOPackage\\BufferedWriter.txt"));
		bw.write('P');
		bw.newLine();
		char[] chr = "Pavan".toCharArray();
		bw.write(chr);
		bw.newLine();
		bw.write("Tools");
		bw.flush();
		bw.close();
	}
}
