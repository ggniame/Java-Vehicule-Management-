public class SuiviVehicule implements Runnable {
	protected Vehicule v;
	public SuiviVehicule(Vehicule v) {
		this.v=v;
		}
	public void run() {
	try {
		for(int i=0;i<5;i++) {
			v.consommer();
			Thread.sleep(1000);
		}
	}catch(InterruptedException e) {}
}
}