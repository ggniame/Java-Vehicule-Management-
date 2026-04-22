public class Voiture extends Vehicule {
	protected String carb;
	public Voiture(String id,String marque,int VitesseMax,String carb) {
		super(id,marque,VitesseMax);
		this.carb=carb;
	}
	public void consommer() {
		System.out.println("Consommation = 4L/100Km");
	}
	public void affiche() {
		super.afficher();
		System.out.println("Carburant : "+ this.carb);
	}
}
