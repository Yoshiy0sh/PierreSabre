package histoire;

import personnages.Ronin;
import personnages.Commercant;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		Commercant Marco = new Commercant("Marco", 0);
		roro.donner(Marco);
	}
}
