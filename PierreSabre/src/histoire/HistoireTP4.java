package histoire;

import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Yakuza yakuLeNoir = new Yakuza("Warsong","Yaku Le Noir","sochu",45);
		roro.provoquer(yakuLeNoir);
	}
}
