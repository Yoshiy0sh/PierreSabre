package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String clan,String nom,String boissonFavorite,int argent) {
		super(nom,boissonFavorite,argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime){
		parler("Tiens tiens tiens, ne serait ce pas un marchand faible qui passe par là?");
		int argentCommercant = 0;
		parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse!");
		argentCommercant = victime.seFaireExtorquer();
		gagnerArgent(argentCommercant);
		parler("J'ai piqué les 15 sous de" + victime.getNom() +" ce qui me fait "+ this.argent +" sous dans ma poche. Hihi");
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public int perdre(){
		int perte = getArgent();
		perdreArgent(perte);
		this.reputation --;
		parler("J’ai perdu mon duel et mes " + perte + " sous, snif... J'ai déshonoré le clan de " + getClan()+ " .");
		return perte;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+ getNom()+" du clan de " + getClan() + " ? Je l'ai dépouillé de ses "+ gain +" sous");
		gagnerArgent(gain);
		this.reputation++;
	}
}
