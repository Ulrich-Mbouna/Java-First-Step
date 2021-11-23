import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville vl = null;
			try {
				vl = new Ville("Be",12000,"CAmeroun");
				
			} catch (NombreHAbitantsExceptions e) {
				// TODO: handle exception
			}
			catch (NomVilleException e) {
				// TODO: handle exception
				System.err.println(e.getMessage());
			}
			finally {
				if(vl == null) {
					vl = new Ville();
				}
				
			}
			System.out.println(vl.toString());
			
	}

}

class NombreHAbitantsExceptions extends Exception {
	public NombreHAbitantsExceptions() {
		System.out.println("Vous essayé d\'intancier une classe ville avec un nombre négatif d\'habitant");
		
	}
	
	public  NombreHAbitantsExceptions(int nbre) {
		System.out.println("Vous avez essayez de créer une ville avec un nombre d'habitant négatif.");
		System.out.println("\t => " + nbre);
	}
}

class NomVilleException extends Exception {
	public NomVilleException(String message) {
		super(message);
	}
}
class Ville {
	public int nbrInstance = 0;
	public int nbrInstanceBis = 0;
	String nomVille;
	String 	nomPays;
	int nbreHAbitant;
	
	
	public void setCategories() {
		System.out.println(this.nomVille +" est une ville du "+this.nomPays+" et possède " +this.nbreHAbitant+" Habitants, il est donc de categorie C");
	}
//	
	
	public  Ville() {
		this.nbreHAbitant = 20000;
		this.nomPays = "CAmeroun";
		this.nomVille = "Bertoua";
		
		this.setCategories();
	}
	
	public Ville(String pNom, int pNbre, String pPAys) throws NombreHAbitantsExceptions, NomVilleException {
		if(pNbre < 0) {
			throw new NombreHAbitantsExceptions(pNbre);
		}
		
		if(pNom.length() < 3) {
			throw new NomVilleException("Le nom de la ville inférieur à 3 caractère !! \t => nom :" + pNom);
		} 
		else{
			nbrInstance++;
			nbrInstanceBis++;
			
			nomPays = pPAys;
			nomVille = pNom;
			nbreHAbitant = pNbre;
			
			this.setCategories();
		}
		
	}
}
