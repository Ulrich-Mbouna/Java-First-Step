package cm.msus.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Cette classe me sert de teste de comparaison de la vitesse entre
 *  FileInputStream et BufferedInputStream
 */
public class InputOutput3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(new File("test.txt"));
			fos = new FileOutputStream(new File("test2.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("test3.txt")));
			
			byte[] buf = new byte[8];
			
			long startTime = System.currentTimeMillis();
			
			while(fis.read(buf) !=-1) {
				fos.write(buf);
			};
				System.out.println("Temps de LEcture + ecriture  avec FileStream : "+ 
						(System.currentTimeMillis() - startTime));
			
			startTime = System.currentTimeMillis();
			
			while(bis.read(buf) !=-1) {
				bos.write(buf);
			};
				System.out.println("TEmps de lecture +ecriture avec BUfferedINputSTream : "+ 
						(System.currentTimeMillis() - startTime));
			
	
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
