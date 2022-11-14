package Personnages;

public class Samourai extends Humain {
	public int honneur;
	private String seigneur;
	
	public Samourai(String nom, String boisson, int argent, int honneur, String seigneur) {
		super(nom, boisson, argent);
		this.honneur=honneur;
		this.seigneur= seigneur;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Je suis fier de servir " + seigneur);
	}
	@Override
	public void boire() {
		System.out.println("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+ boisson);
	}
	
	
}