package personnages;

public class Commercant extends Humain {

	public Commercant(String nom,int argent) {
		super(nom,"thé",argent);
	}
	
	public void seFaireExtorquer() {
		this.argent = 0;
		parler("le monde est vraiment trop injuste");
	}
	
	public void recevoir(int argent) {
		this.argent += argent;
		parler(argent+ " sous ! je te remercie généreux donateur !");
	}
	


}
