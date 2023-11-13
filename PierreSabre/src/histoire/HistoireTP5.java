package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Warsong","Yaku Le Noir", "whisky",30);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
//		yaku.faireConnaissanceAvec(marco);
//		roro.faireConnaissanceAvec(marco);
		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
	}

}
