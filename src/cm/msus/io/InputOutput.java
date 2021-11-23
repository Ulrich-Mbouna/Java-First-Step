package cm.msus.io;

import java.io.File;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		
		System.out.println("Absolute path of file : " + f.getAbsolutePath());
		System.out.println("Nom du fichier : " + f.getName());
		System.out.println("ES ce qu'il existe ?: " + f.exists());
		System.out.println("ES ce un repertoire ? : " + f.isDirectory());
		System.out.println("ES ce un fichier ? : " + f.isFile());
		
		System.out.println("Affichage des lecteurs à la racine du PC : ");
		for(File file: f.listRoots()) {
			System.out.println("PAth absolue : " + file.getAbsolutePath());
			
			try {
				int i = 1;
				
				for(File nom : file.listFiles()) {
					System.out.println("\t\t"+
							((nom.isDirectory()) ? nom.getName()+"/" : nom.getName())
				);
					
					if(i%4 == 0) {
						System.out.println("\n");
					}
					i++;
					
				}
				
				System.out.println("\n");
				
				
			} catch (NullPointerException e) {
				// TODO: handle exception
			}
		}
	}

}
