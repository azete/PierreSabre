package Personnages;

public class Humain {
	public String nom;
	private String boisson;
	public int argent;

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
			System.out.println("Je n'ai plus que "+ argent + " sous en poche, Je ne peux meme pas m'offrir " + bien + " � " + prix );
		} else {
			perdreArgent(prix);
			System.out.println("j'ai "+ argent + " sous en poche, je vais pouvoir m'acheter "+ bien + " � " + prix);
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
}
