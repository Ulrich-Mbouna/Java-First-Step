package cm.msus.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Cette classe me permet de tester les Objects sérialisable et de voir leurs applications
*/
public class InputOutput4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));
			
			oos.writeObject(new Game("Assassin Greed","Aventure",43.69));
			oos.writeObject(new Game("Tom Raider","Plateforme",25.24));
			oos.writeObject(new Game("Tetris","STrategie",3.69));
			
			oos.close();
			
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt"))));
			
			try {
				System.out.println("Lecture du contenu du fichier games : ");
				System.out.println("*********************\n");
				System.out.println(((Game)ois.readObject()).toString()+"\n");
				System.out.println(((Game)ois.readObject()).toString()+"\n");
				System.out.println(((Game)ois.readObject()).toString());
				
			}
			catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			ois.close();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
	}

}

class Game implements Serializable {
	private String nom,style;
	private double prix;
	private transient Notice notice;
	
	public Game(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
		this.notice = new Notice();
	}
	
	public String toString() {
		
		return "Nom du Jeu : " + this.nom +
				"\nStyle du jeu  : "+ this.style +
				"\nPrix du Jeu : " + this.prix;
				
	}
}

class Notice{
	public String langue;
	
	public Notice() {
		this.langue = "FRancais";
	}
	
	public Notice(String langue) {
		this.langue = langue;
	}
	
	public String toString() {
		return "La Langue de la Notice : " + this.langue;
	}
}
