package Personnages;

public class Ronin extends Humain{
	private int honneur =1;
	
	public Ronin(String nom, String boisson, int argent, int honneur) {
		super(nom, boisson, argent);
		this.honneur=honneur;
	}
	public void donner(Commercant j) {
		int kdo= argent*1/10;
		argent *= 1/10;
		super.parler( j.nom +" prend ces  "+ kdo);
	}
}
