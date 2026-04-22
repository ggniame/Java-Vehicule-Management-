public abstract class Vehicule implements Comparable<Vehicule>{
	protected String id;
	protected String marque;
	protected int VitesseMax;
	public Vehicule(String id,String marque,int VitesseMax) {
		this.id=id;
		this.marque=marque;
		this.VitesseMax=VitesseMax;
	}
	public abstract void consommer();
	public void SetVitesseMax(int vitesse) throws VitesseInvalideException{
		if(vitesse<=20 || vitesse > 120) {
			throw new VitesseInvalideException("Vitesse invalide");
		}
		this.VitesseMax=vitesse;
	}
	public int compareTo(Vehicule v) {
		if(this.VitesseMax!=v.VitesseMax)return this.VitesseMax-v.VitesseMax;
		return this.marque.compareTo(v.marque);
	}
	public void afficher() {
		System.out.println("ID:"+this.id);
		System.out.println("Marque:"+this.marque);
		System.out.println("Vitesse Max:"+this.VitesseMax);
	}
}


