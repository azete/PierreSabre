package histoire;
import Personnages.Humain;
import Personnages.Commercant;
import Personnages.Yakusa;
import Personnages.Ronin;
import Personnages.Yakusa;
import Personnages.Samourai;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco","th�", 20);
//		Commercant chonin = new Commercant("Chonin","th�", 40);
//		Commercant kumi = new Commercant("Kumi","th�", 10);
//		Yakusa yaku = new Yakusa("Yaku Le Noir", "whisky", 30, "Warsong", 0);
//		Ronin roro = new Ronin("Roro", "shochu", 60, 0);
		Samourai akimoto = new Samourai("Akimoto", "sak�", 80, 0, "Miyamoto");
//		yaku.direBonjour();
//		akimoto.direBonjour();
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
		akimoto.boire();
	}
}
