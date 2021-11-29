package Enumeration;

public class Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		affiche();

	}
	
	public enum Langage {
		JAVA ( "Langage JAva","EClipse"),
		PHP  ("Langage Php","Phpstorm"),
		C  ("Langage C","Code block"), 
		PYHTON  ("Langage Python","Pycharm");

		private String  name ="";
		private String  editor ="";
		
		Langage(String name,String editor) {
			this.name = name;
			this.editor = editor;
		}
		
		public String getEditor() {
			return editor;
		}
		
		public String toString() {
			return name;
		}
	};

	public static void affiche() {
		
		for(Langage lang : Langage.values()) {
			if(Langage.JAVA.equals(lang)) {
				System.out.println("J'aime le" + lang + " ecrit avec " + lang.getEditor());
			}
			else {
				System.out.println(lang + " ecrit avec " + lang.getEditor());
			}
		}
	}
}
