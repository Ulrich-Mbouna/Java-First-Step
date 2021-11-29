package cm.msus.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharArrayWriter caw = new CharArrayWriter();
		CharArrayReader car = null;
		
		try {
			caw.write("Hello my name is Ulrich");
			System.out.println("Char Array WRiter : " + caw);
			caw.close();
			
			car = new CharArrayReader(caw.toCharArray());
			
			int i = 0;
			
			String str = "";
			
			while(((i = car.read()) !=-1)) {
				str+= (char) i;
				
				System.out.println("Char array reader : " + str);
			}
			
			
			
			car.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
