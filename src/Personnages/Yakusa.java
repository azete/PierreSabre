package Personnages;

public class Yakusa extends Humain{
	private String clan;
	private int reputation;
	
	public Yakusa (String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan= clan;
		this.reputation= reputation;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.nom +"si tu tiens à la vie donne moi ta bourse !");
		super.gagnerArgent(victime.argent);
		reputation+=1;
		super.parler("J’ai piqué les "+ victime.argent+ " sous de "+ victime.nom + ", ce qui me fait "+ argent +" sous dans ma poche. Hi ! Hi !");
	}
	
}
