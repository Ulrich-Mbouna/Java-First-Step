package cm.msus.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("textFileReaderWriter.txt");
		FileReader fr;
		FileWriter fw;
		
		try {
			fw = new FileWriter(file);
			
			String str = "HI,je continue de lire le JAva\n";
			
			str+= "MAis la je compte devenir bon\n";
			
			fw.write(str);
			
			System.out.println("File writer :" + fw);
			
			fw.close();
			
			fr = new  FileReader(file);
			
			int i = 0;
			str = "";
			
			while((i=fr.read()) !=-1 ) 
				str += (char) i;
				
				System.out.println("File reader : "+ str);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
