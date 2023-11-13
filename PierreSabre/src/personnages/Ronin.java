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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int forceRonin = this.honneur *2;
		if(forceRonin >= adversaire.getReputation()) {
			gagnerArgent(adversaire.perdre());
			parler("Je t’ai eu petit yakusa!");
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			setArgent(0);
		}
		
	}
}
