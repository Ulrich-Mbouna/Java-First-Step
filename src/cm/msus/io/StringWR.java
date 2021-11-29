package cm.msus.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringWriter sw = new StringWriter();
		StringReader sr = null;
		
		try {
			sw .write("HELLO C'EST ENCORE MOI");
			
			System.out.println("Strng writer : " + sw);
			sw.close();
			
			sr = new StringReader(sw.toString());
			
			int i= 0;
			
			String str = "";
			
			while((i= sr.read()) != -1) {
				str += (char) i;
				
				System.out.println("String reader" + str);
			}
			
			sr.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
