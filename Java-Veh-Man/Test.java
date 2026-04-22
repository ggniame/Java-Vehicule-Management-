import java.util.*;
public class Test {
	public static void main(String args[]) {
		List <Vehicule> vehicules= new ArrayList<>();
		Voiture v1 = new Voiture("id1","vols",100,"Diesel");
		Moto m1 = new Moto("id2","yamaha",115,"Cyl");
		Voiture v2 =new Voiture("id3","fiat",100,"Diesel");
		vehicules.add(v1);
		vehicules.add(v2);
		vehicules.add(m1);
		
		Collections.sort(vehicules);
		for(Vehicule v: vehicules) {
			v.afficher();
		}
		
		Thread t1 =new Thread(new SuiviVehicule(v1));
		Thread t2 =new Thread(new SuiviVehicule(m1));
		t1.start();
		t2.start();
	}
}
