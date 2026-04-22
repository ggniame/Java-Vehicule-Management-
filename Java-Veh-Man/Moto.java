public class Moto extends Vehicule{
	protected String Cyl;
	public Moto(String id,String marque,int VitesseMax,String Cyl) {
		super(id,marque,VitesseMax);
		this.Cyl=Cyl;
	}
	public void consommer() {
		System.out.println("Consommation = 1L/100Km");
	}
	public void affiche() {
		super.afficher();
		System.out.println("Cylindre : "+ this.Cyl);
	}
}

