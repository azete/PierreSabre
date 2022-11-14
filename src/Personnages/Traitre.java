package Personnages;

public class Traitre extends Samourai{
	private int niveauTraitrise; 
	
	public Traitre (String nom, String boisson, int argent, int honneur, String seigneur, int niveauTraitrise) {
		super(nom,boisson,argent,honneur, seigneur);
		this.niveauTraitrise= niveauTraitrise;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println( "Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + " . Chut !");
	}
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise >= 3 ) {
			System.out.println( " Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
		else {
			int x=commercant.argent;
			commercant.perdreArgent(1/5 * x);
			super.gagnerArgent(1/5 * x);
			niveauTraitrise++;
		}
	}
}
