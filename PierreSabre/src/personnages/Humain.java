package personnages;

public class Humain {
	protected String nom;
	protected String boissonFavorite;
	protected int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[3];
	
	public Humain(String nom,String boissonFavorite,int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
	}

	public int getArgent() {
		return argent;
	}
	
	public void setArgent(int argent) {
		this.argent = argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" +getNom() + ") "+ texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoissonFavorite());
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+getBoissonFavorite()+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (getArgent() >= prix) {
			parler("J'ai "+getArgent()+" sous en poche. Je vais pouvoir acheter "+ bien+ " à "+ prix + " sous");
			perdreArgent(prix);
		} else {
			parler("J'ai "+getArgent()+" sous en poche. Je ne peux même pas m'offrir "+ bien+ " à "+ prix + " sous");
		}
	}
	
	public void gagnerArgent(int gain){
		this.argent += gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public int getNbConnaissance() {
		return nbConnaissance;
	}
	
	private void memoriser(Humain Homme) {
		int curseur = getNbConnaissance()%3;
		memoire[curseur] = Homme;
	}
	
	public void setNbConnaissance(int nbConnaissance) {
		this.nbConnaissance = nbConnaissance;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.direBonjour();
		autreHumain.memoriser(this);
		memoriser(autreHumain);
		setNbConnaissance(getNbConnaissance()+1);
		
	}
	
	public void listerConnaissance() {
		int connaissance = getNbConnaissance();
		String texte = "je connais beaucoup de monde dont ";
		if(connaissance >= 3) {
			for(int i= 0;i<3;i++) {
				texte += memoire[(connaissance - ((connaissance /3)*3) + i)%3].getNom()+ " ";
				
			}
		}
		else {
			for(int i = 0;i<connaissance;i++) {
				texte += memoire[i].getNom() + " ";
			}
			parler(texte);
		}
	}
}
