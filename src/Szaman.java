package dziedziczenie.postacie;

public class Szaman extends Postac {

	public void atak (double predkoscAtaku, double atak, double kryt, double inteligencja, double zrêcznosæ){
		this.predkoscAtaku = predkoscAtaku;
		this.atak = atak;
		this.kryt = kryt;
		this.inteligencja = inteligencja;
		this.zrêcznoœæ = zrêcznoœæ;
		double damage = predkoscAtaku + atak + kryt + inteligencja + zrêcznoœæ;
		System.out.println("Zadajesz: " + damage + " obra¿eñ");}
	
}

