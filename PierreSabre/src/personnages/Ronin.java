package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav,int argent) {
		super(nom,boissonFav,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		double don = (this.argent)*0.1;
		int donInt = 0;
		donInt += don;
		parler(beneficiaire.getNom()+"prends ces "+ donInt + " sous");
		beneficiaire.gagnerArgent(donInt);
		perdreArgent(donInt);	
		beneficiaire.parler(donInt + " ! Je te remercie généreux donateur!");
	}
}
