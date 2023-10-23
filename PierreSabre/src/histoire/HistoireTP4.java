package histoire;

import personnages.Commercant;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant Marco = new Commercant("Marco",20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
	}
}
