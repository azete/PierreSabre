package histoire;
//import Personnages.Humain;
import Personnages.Commercant;
import Personnages.Yakusa;
import Personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain humain = new Humain ("Prof", "Kombucha", 54);
//		humain.direBonjour();
//		humain.acheter("boisson", 12);
//		humain.boire();
//		humain.acheter("jeu",2);
//		humain.acheter("kimono", 50);
		Commercant j= new Commercant("Marco", "th�" , 20);
//		j.direBonjour();
//		j.seFaireExtorquer();
//		j.recevoirArgent(15);	
//		j.boire();
//		Yakusa k = new Yakusa ("Yaku le noir", "whisky", 30 , "Warsong", 0);
//		k.direBonjour();
//		k.extorquer(j);
//		j.seFaireExtorquer();
		Ronin u = new Ronin ("Roro", "Shochu", 60, 1);
		u.direBonjour();
		u.donner(j);
		j.recevoirArgent(u.argent*1/10);
	}
}
