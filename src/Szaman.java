public class Szaman extends Postac {

	public void atak (double predkoscAtaku, double atak, double kryt, double inteligencja, double zrecznosc){
		this.predkoscAtaku = predkoscAtaku;
		this.atak = atak;
		this.kryt = kryt;
		this.inteligencja = inteligencja;
		this.zrecznosc = zrecznosc;
		double damage = predkoscAtaku + atak + kryt + inteligencja + zrecznosc;
		System.out.println("Zadajesz: " + damage + " obra�e�");}
	
}

