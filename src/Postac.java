package dziedziczenie.postacie;

public class Postac {
	public double predkoscAtaku;
	public double predkoscChodzenia;
	public double hp = 100;
	public double obrona;
	public double atak;
	public double money;
	public int level;
	public double kryt;
	public double mana;
	public double exp;
	
	public double zrêcznoœæ;
	public double inteligencja;
	public double witalnoœæ;
	public double si³a;
	
	public void atak (double predkoscAtaku, double atak, double kryt){
		this.predkoscAtaku = predkoscAtaku;
		this.atak = atak;
		this.kryt = kryt;
		double damage = predkoscAtaku + atak + kryt;
		System.out.println("Zadajesz: " + damage + " obra¿eñ");}
	
	public void obrona (double hp, double obrona){
		this.hp = hp;
		this.obrona = obrona;
		double def = hp + obrona;
		System.out.println("Mo¿esz przyj¹æ: " + def + " obra¿eñ");}
	
	public void hp (double hp, double obrazenie){
		this.hp = hp - obrazenie;
		System.out.println("Zosta³o Ci: " + this.hp + " ¿ycia");}
	
	public void level (double exp){
		if (exp<200) {this.level = 1;
		System.out.println("Twój level wynosi 1 ");}
		if (exp>=200 && exp<300){ this.level = 2;
		System.out.println("Twój level wynosi 2 ");}
		if (exp>=300 && exp<400){ this.level = 3;
		System.out.println("Twój level wynosi 3 ");}
		if (exp>=400 && exp<500){ this.level = 4;
		System.out.println("Twój level wynosi 4 ");}
		if (exp>=500 && exp<600){ this.level = 5;
		System.out.println("Twój level wynosi 5 ");}
		if (exp>=600 && exp<700){ this.level = 6;
		System.out.println("Twój level wynosi 6 ");}
		if (exp>=700 && exp<800){ this.level = 7;
		System.out.println("Twój level wynosi 7 ");}
		if (exp>=800 && exp<900){ this.level = 8;
		System.out.println("Twój level wynosi 8 ");}
		if (exp>=900 && exp<1000){ this.level = 9;
		System.out.println("Twój level wynosi 9 ");}
		}

	public Postac(){
		
	}
	public Postac(double predkoscChodzenia){
		this.predkoscChodzenia = predkoscChodzenia;
	}

	public void próbna(){
		System.out.println("Dzia³a");
	}	
	}

