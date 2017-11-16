package dziedziczenie.postacie;

public class Wojownik extends Postac{
	
	public void atak (double predkoscAtaku, double atak, double kryt, double si³a){
		this.predkoscAtaku = predkoscAtaku;
		this.atak = atak;
		this.kryt = kryt;
		this.si³a = si³a;
		double damage = predkoscAtaku + atak + kryt + si³a;
		System.out.println("Zadajesz: " + damage + " obra¿eñ");}

}
