package Personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, "th�", argent);
	}

	public void recevoirArgent(int argent2) {
		super.gagnerArgent(argent2);
		System.out.println(argent2 + "je te remercie g�n�reux donateur !");
	}

	public void seFaireExtorquer() {
		super.perdreArgent(argent);
		System.out.println("J'ai tout perdu ! Le monde est trop injuste...");
	}
}
