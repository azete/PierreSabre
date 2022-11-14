package Personnages;

public class Humain {
	public String nom;
	public String boisson;
	public int argent;
	public int nombreConnaissance;
	public Humain[] memoire = new Humain[30];

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public void direBonjour() {
		System.out.println("Bonjour ! , Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}

	public void boire() {
		System.out.println("Mmmmm, un bon verre de " + boisson + " ! Gloupss !");
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			System.out.println("Je n'ai plus que " + argent + " sous en poche, Je ne peux meme pas m'offrir " + bien
					+ " à " + prix);
		} else {
			perdreArgent(prix);
			System.out.println("j'ai " + argent + " sous en poche, je vais pouvoir m'acheter " + bien + " à " + prix);
		}
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void parler(String texte) {
		System.out.println("L'humain " + nom + " dit : " + texte + " .");
	}

	public void memoriser(Humain autreHumain) {
		if (nombreConnaissance == 30) {
			memoire[0] = autreHumain;
		} else {
			memoire[nombreConnaissance] = autreHumain;
		}
	}
	public void repondre(Humain autreHumain) {
		autreHumain.direBonjour();
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
	}
	public void listerConnaissance() {
		System.out.println("Je connais bcp de monde dont : ");
		for (int i=0; i< nombreConnaissance;i++) {
			System.out.println( memoire[i].nom);
		}
	}
}
