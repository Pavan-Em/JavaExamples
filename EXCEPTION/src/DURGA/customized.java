package DURGA;

import java.io.IOException;

public class customized extends IOException {
		public customized(String st) {
			// TODO Auto-generated constructor stub
			
			super(st);
		}
		
			public static void main(String[] args) throws IOException {
				throw new customized("hehehe my Exception");
			}
}
