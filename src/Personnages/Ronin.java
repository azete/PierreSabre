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
	public void provoquer(Yakusa adversaire) {
		if (honneur >= adversaire.reputation * 2){
			honneur+=1;
			argent+= adversaire.argent;
			parler("j'ai gagner");
			adversaire.perdre();
		}
		else {
			adversaire.gagner(argent);
			honneur-=1;
			argent=0;
			parler("j'ai perdu ...");
		}
	}
}
