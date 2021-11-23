package cm.msus.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(new File("test.txt"));
			fos = new FileOutputStream(new File("test2.txt"));
			
			byte[] buf = new byte[8];
			
			//variable contenant le résultat de la lecture, -1 si finie
			int n =0;
			
			while ((n=fis.read(buf)) >= 0) {
				fos.write(buf);
				for(byte bit: buf) 
					System.out.println("\tByte lu : " + bit + "( "+(char)bit + " )");
					System.out.println("");
			}
			
			System.out.println("Copie Terminée");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(fis != null) 
					fis.close();
				if(fos != null) 
					fos.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
