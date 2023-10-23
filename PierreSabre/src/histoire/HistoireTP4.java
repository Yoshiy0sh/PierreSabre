package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Yakuza Yaku = new Yakuza("Warsong","Yaku le Noir","whisky",30);
		Yaku.direBonjour();
		Commercant marco = new Commercant("Marco",15);
		Yaku.extorquer(marco);
	}
}
