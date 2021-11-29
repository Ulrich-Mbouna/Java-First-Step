package cm.msus.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CompareBUfferedAndNIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileChannel fc = null;
		
		
		try {
			fis = new FileInputStream(new File("test.txt"));
			bis = new BufferedInputStream(fis);
			
			long startTime = System.currentTimeMillis();
			
			while(bis.read() !=-1);
				System.out.println("TEmps de execution avec buffer conventionnel : "+ 
						(System.currentTimeMillis() - startTime));
			
			fis = new FileInputStream(new File("test.txt"));
			fc = fis.getChannel();
			
			int size = (int) fc.size();
			
			ByteBuffer bBuff = ByteBuffer.allocate(size);
			startTime = System.currentTimeMillis();
			
			fc.read(bBuff);
			
			bBuff.flip();
			System.out.println("TEmps de execution avec buffer de la classe NIO : "+ 
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

