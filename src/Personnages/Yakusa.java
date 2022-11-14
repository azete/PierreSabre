package Personnages;

public class Yakusa extends Humain{
	private String clan;
	public int reputation;
	
	public Yakusa (String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan= clan;
		this.reputation= reputation;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		super.parler(victime.nom +"si tu tiens � la vie donne moi ta bourse !");
		super.gagnerArgent(victime.seFaireExtorquer());
		reputation++;
		super.parler("J�ai piqu� les "+ victime.argent+ " sous de "+ victime.nom + ", ce qui me fait "+ argent +" sous dans ma poche. Hi ! Hi !");
	}
	public void perdre() {
		argent=0;
		reputation--;
		parler("jai tout perdu...");
	}
	public void gagner(int gain) { 
		argent+= gain;
		reputation++;
		parler("J'ai gagner ahahah");
	}
}
